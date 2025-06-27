package br.com.bertolo.carstockapi.users.adapters.inbound;

import br.com.bertolo.carstockapi.users.adapters.inbound.dtos.CreateUserDTO;
import br.com.bertolo.carstockapi.users.adapters.inbound.dtos.ResponseUserDTO;
import br.com.bertolo.carstockapi.users.adapters.inbound.mappers.UserDTOMapper;
import br.com.bertolo.carstockapi.users.core.domain.User;
import br.com.bertolo.carstockapi.shared.exceptions.ResourceNotFoundException;
import br.com.bertolo.carstockapi.users.core.usecases.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController()
@RequestMapping("/api/v1/users")
public class UserController {

    private final CreateUserUseCase createUserUseCase;
    private final GetAllUserUseCase getAllUserUseCase;
    private final GetUserByEmailUseCase getUserByEmailUseCase;
    private final GetUserByIdUseCase getUserByIdUseCase;
    private final DeleteUserByIdUseCase deleteUserByIdUseCase;

    public UserController(
            CreateUserUseCase createUserUseCase,
            GetAllUserUseCase getAllUserUseCase,
            GetUserByEmailUseCase getUserByEmailUseCase,
            GetUserByIdUseCase getUserByIdUseCase,
            DeleteUserByIdUseCase deleteUserByIdUseCase
    ) {
        this.createUserUseCase = createUserUseCase;
        this.getAllUserUseCase = getAllUserUseCase;
        this.getUserByEmailUseCase = getUserByEmailUseCase;
        this.getUserByIdUseCase = getUserByIdUseCase;
        this.deleteUserByIdUseCase = deleteUserByIdUseCase;
    }

    @PostMapping()
    public ResponseEntity<ResponseUserDTO> createUser(@RequestBody CreateUserDTO userDTO) {
        User user = this.createUserUseCase.execute(UserDTOMapper.toDomain(userDTO));
        return ResponseEntity.status(HttpStatus.CREATED).body(new ResponseUserDTO(user.getName(), user.getEmail()));
    }

    @GetMapping()
    public ResponseEntity<List<ResponseUserDTO>> getAllUsers() {
        List<User> user = this.getAllUserUseCase.execute();
        List<ResponseUserDTO> responseUser = user.stream().map(userDto -> new ResponseUserDTO(userDto.getName(), userDto.getEmail())).collect(Collectors.toList());

        return ResponseEntity.status(HttpStatus.OK).body(responseUser);
    }

    @GetMapping(params = "email")
    public ResponseEntity<ResponseUserDTO> getUserByEmail(
            @RequestParam("email") String email
    ) {
        User user = this.getUserByEmailUseCase.execute(email)
                .orElseThrow(() -> new ResourceNotFoundException("Usuário com o email " + email + " não foi encontrado"));
        return ResponseEntity.status(HttpStatus.OK).body(new ResponseUserDTO(user.getName(), user.getEmail()));
    }

    @GetMapping("{id}")
    public ResponseEntity<ResponseUserDTO> getUserById(@PathVariable Long id) {
        User user = this.getUserByIdUseCase.execute(id)
                .orElseThrow(() -> new ResourceNotFoundException("Usuário com o id "+ id + " não foi encontrado"));
        return ResponseEntity.status(HttpStatus.OK).body(new ResponseUserDTO(user.getName(), user.getEmail()));
    }

    @DeleteMapping("{id}")
    public ResponseEntity<Void> deleteUser(@PathVariable Long id) {
        this.deleteUserByIdUseCase.execute(id);
        return ResponseEntity.noContent().build();
    }


}
