package br.com.bertolo.carstockapi.users.infrastructure.repositories;

import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<UserEntity, Long> {
}
