package br.com.bertolo.carstockapi.users.adapters.inbound;

import br.com.bertolo.carstockapi.users.adapters.inbound.dtos.CreateUserDTO;
import br.com.bertolo.carstockapi.users.adapters.inbound.dtos.ResponseUserDTO;
import br.com.bertolo.carstockapi.users.adapters.inbound.mappers.UserDTOMapper;
import br.com.bertolo.carstockapi.users.core.domain.User;
import br.com.bertolo.carstockapi.users.core.usecases.CreateUserUseCase;
import br.com.bertolo.carstockapi.users.core.usecases.GetAllUserUseCase;
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

    public UserController(
            CreateUserUseCase createUserUseCase,
            GetAllUserUseCase getAllUserUseCase
    ) {
        this.createUserUseCase = createUserUseCase;
        this.getAllUserUseCase = getAllUserUseCase;
    }

    @PostMapping()
    public ResponseEntity<ResponseUserDTO> createUser(@RequestBody CreateUserDTO userDTO) {
        try {
            User user = this.createUserUseCase.execute(UserDTOMapper.toDomain(userDTO));
            return ResponseEntity.status(HttpStatus.CREATED).body(new ResponseUserDTO(user.getName(), user.getEmail()));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @GetMapping()
    public ResponseEntity<List<ResponseUserDTO>> getAllUsers() {
        try {
            List<User> user = this.getAllUserUseCase.execute();
            List<ResponseUserDTO> responseUser = user.stream().map(userDto -> new ResponseUserDTO(userDto.getName(), userDto.getEmail())).collect(Collectors.toList());

            return ResponseEntity.status(HttpStatus.OK).body(responseUser);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
