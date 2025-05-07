package br.com.bertolo.carstockapi.users.infrastructure.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;
import java.util.UUID;

public interface UserRepository extends JpaRepository<UserEntity, Long> {
    boolean existsByEmail(String email);
}
