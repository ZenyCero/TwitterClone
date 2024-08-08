package org.zerocool.securityservice.domain.repository;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;
import org.zerocool.securityservice.application.UserMapper;
import org.zerocool.securityservice.domain.model.UserEntity;
@Repository
public interface UserRepository extends ReactiveCrudRepository<UserEntity, String> {
    UserEntity findByUsernameAndPassword(String username, String password);
    Boolean existsByUsernameAndPassword(String username, String password);
}
