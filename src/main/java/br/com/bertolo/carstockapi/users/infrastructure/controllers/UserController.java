package br.com.bertolo.carstockapi.users.infrastructure.controllers;

import br.com.bertolo.carstockapi.users.application.services.DeleteUserByIdService;
import br.com.bertolo.carstockapi.users.application.services.GetUserByIdService;
import br.com.bertolo.carstockapi.users.application.services.GetUsersService;
import br.com.bertolo.carstockapi.users.application.usecases.CreateUserUseCase;
import br.com.bertolo.carstockapi.users.application.usecases.UpdateUserUseCase;
import br.com.bertolo.carstockapi.users.domain.entities.User;
import jakarta.validation.Valid;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api/v1/users")
public class UserController {

    private final CreateUserUseCase createUserUseCase;
    private final GetUsersService getUsersService;
    private final GetUserByIdService getUserByIdService;
    private final DeleteUserByIdService deleteUserByIdService;
    private final UpdateUserUseCase updateUserUseCase;

    public UserController(
            CreateUserUseCase createUserUseCase,
            GetUsersService getUsersService,
            GetUserByIdService getUserByIdService,
            DeleteUserByIdService deleteUserByIdService,
            UpdateUserUseCase updateUserUseCase
    ) {
        this.createUserUseCase = createUserUseCase;
        this.getUsersService = getUsersService;
        this.getUserByIdService = getUserByIdService;
        this.deleteUserByIdService = deleteUserByIdService;
        this.updateUserUseCase = updateUserUseCase;
    }

    @GetMapping
    public ResponseEntity<Page<ResponseUserDTO>> getUsers(
            @PageableDefault(page = 0, size = 20) Pageable pageable
    ) {
        Page<User> users = this.getUsersService.getAllUsers(pageable);
        return ResponseEntity.status(200).body(users.map(UserDTOMapper::toResponseDTO));
    }

    @GetMapping("/{id}")
    public ResponseEntity<Optional<ResponseUserDTO>> getUserById(
            @PathVariable("id") Long id
    ) {
        Optional<User> user = this.getUserByIdService.getUserById(id);
        return ResponseEntity.status(200).body(user.map(UserDTOMapper::toResponseDTO));
    }

    @PostMapping
    public ResponseEntity<ResponseUserDTO> createUser(
            @RequestBody @Valid RequestUserDTO userDTO
    ) {
        var user = this.createUserUseCase.execute(UserDTOMapper.toDomain(userDTO));
        return ResponseEntity.ok(UserDTOMapper.toResponseDTO(user));
    }

    @DeleteMapping("/{id}")
    public void deleteUser(
            @PathVariable("id") Long id
    ) {
        this.deleteUserByIdService.deleteUserById(id);
    }

    @PutMapping("/{id}")
    public void updateUser(
            @PathVariable("id") Long id,
            @RequestBody @Valid RequestUserDTO userDTO
    ) {
        this.updateUserUseCase.execute(id, UserDTOMapper.toDomain(userDTO));
    }
}
