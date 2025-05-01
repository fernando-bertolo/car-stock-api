package br.com.bertolo.carstockapi.users.infrastructure.controllers;

import br.com.bertolo.carstockapi.users.domain.entities.RequestUserDTO;
import br.com.bertolo.carstockapi.users.domain.entities.ResponseUserDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/v1/users")
public class UserController {

    @GetMapping
    public ResponseEntity<List<ResponseUserDTO>> getUsers() {
        return ResponseEntity.ok(List.of(new ResponseUserDTO(UUID.randomUUID(), "Fernando", "fernando@gmail.com", 1)));
    }
}
