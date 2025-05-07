package br.com.bertolo.carstockapi.users.infrastructure.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<UserEntity, Long> {
    Optional<UserEntity> existsByEmail(String email);
}
