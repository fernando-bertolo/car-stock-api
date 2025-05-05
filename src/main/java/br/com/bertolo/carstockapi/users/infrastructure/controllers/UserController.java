package br.com.bertolo.carstockapi.users.infrastructure.controllers;

import br.com.bertolo.carstockapi.users.application.services.GetUsersService;
import br.com.bertolo.carstockapi.users.application.usecases.CreateUserUseCase;
import br.com.bertolo.carstockapi.users.domain.entities.User;
import br.com.bertolo.carstockapi.users.infrastructure.repositories.UserEntity;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/v1/users")
public class UserController {

    private final CreateUserUseCase createUserUseCase;
    private final GetUsersService getUsersService;
    public UserController(CreateUserUseCase createUserUseCase, GetUsersService getUsersService) {
        this.createUserUseCase = createUserUseCase;
        this.getUsersService = getUsersService;
    }

    @GetMapping
    public ResponseEntity<List<ResponseUserDTO>> getUsers() {
        List<User> users = this.getUsersService.getAllUsers();
        return ResponseEntity.status(200).body(
                users.stream()
                        .map(UserDTOMapper::toResponseDTO)
                        .collect(Collectors.toList())
        );
    }

    @PostMapping
    public ResponseEntity<ResponseUserDTO> createUser(
            @RequestBody @Valid RequestUserDTO userDTO
    ) {
        var user = this.createUserUseCase.execute(UserDTOMapper.toDomain(userDTO));
        return ResponseEntity.ok(UserDTOMapper.toResponseDTO(user));
    }
}
