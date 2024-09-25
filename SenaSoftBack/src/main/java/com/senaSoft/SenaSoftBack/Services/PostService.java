package com.senaSoft.SenaSoftBack.Services;

import com.senaSoft.SenaSoftBack.Entities.PostEntity;
import com.senaSoft.SenaSoftBack.Repositories.PostRepository;
import com.senaSoft.SenaSoftBack.Services.Dao.Idao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PostService implements Idao<PostEntity, Long> {
    @Autowired
    private PostRepository postRepository;


    @Override
    public List<PostEntity> findAll() {
        return postRepository.findAll();
    }

    @Override
    public PostEntity getById(Long id) {
        Optional<PostEntity> postEntity = postRepository.findById(id);
        return postEntity.orElse(null);
    }

    @Override
    public void save(PostEntity entity) {
      this.postRepository.save(entity);
    }

    @Override
    public void update(PostEntity entity) {
      this.postRepository.save(entity);
    }

    @Override
    public void delete(PostEntity entity) {
      this.postRepository.delete(entity);
    }

    @Override
    public void create(PostEntity entity) {
      this.postRepository.save(entity);
    }

    @Override
    public void delete(Long id) {

    }
}
