package com.senaSoft.SenaSoftBack.Repositories;

import com.senaSoft.SenaSoftBack.Entities.PostEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<PostEntity, Long> {
}
