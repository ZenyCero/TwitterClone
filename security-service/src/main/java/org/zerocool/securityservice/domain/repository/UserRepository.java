package org.zerocool.securityservice.domain.repository;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;
import org.zerocool.securityservice.domain.model.UserEntity;
@Repository
public interface UserRepository extends ReactiveCrudRepository<UserEntity, Long> {
}
