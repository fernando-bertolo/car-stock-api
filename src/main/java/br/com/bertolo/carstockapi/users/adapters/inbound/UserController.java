package br.com.bertolo.carstockapi.users.adapters.inbound;

import br.com.bertolo.carstockapi.users.adapters.inbound.dtos.CreateUserDTO;
import br.com.bertolo.carstockapi.users.adapters.inbound.dtos.ResponseUserDTO;
import br.com.bertolo.carstockapi.users.adapters.inbound.mappers.UserDTOMapper;
import br.com.bertolo.carstockapi.users.core.domain.User;
import br.com.bertolo.carstockapi.users.core.usecases.CreateUserUseCase;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
@RequestMapping("/api/v1/users")
public class UserController {

    private final CreateUserUseCase createUserUseCase;

    public UserController(CreateUserUseCase createUserUseCase) {
        this.createUserUseCase = createUserUseCase;
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
}
