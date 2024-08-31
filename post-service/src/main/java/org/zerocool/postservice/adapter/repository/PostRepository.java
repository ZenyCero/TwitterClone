package org.zerocool.postservice.adapter.repository;

import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;
import org.zerocool.postservice.adapter.entity.Post;
import reactor.core.publisher.Flux;

@Repository
public interface PostRepository extends ReactiveMongoRepository<Post, Long> {
    Flux<Post> findAllByUserId(Long userId, Pageable pageable);
}
