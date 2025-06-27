package br.com.bertolo.carstockapi.users.adapters.outbound.database.jpa.repositories;

import br.com.bertolo.carstockapi.users.adapters.outbound.database.jpa.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<UserEntity, Long>{
    Optional<UserEntity> findByEmail(String email);
}
