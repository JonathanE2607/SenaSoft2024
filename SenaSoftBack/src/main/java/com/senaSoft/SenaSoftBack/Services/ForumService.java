package com.senaSoft.SenaSoftBack.Services;

import com.senaSoft.SenaSoftBack.Entities.ForumEntity;
import com.senaSoft.SenaSoftBack.Repositories.ForumRepository;
import com.senaSoft.SenaSoftBack.Services.Dao.Idao;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ForumService implements Idao<ForumEntity, Long> {
    private ForumRepository forumRepository;
    private ForumRepository ForumRepository;

    public ForumService(ForumRepository forumRepository) {
        this.forumRepository = forumRepository;
    }

    @Override
    public List<ForumEntity> findAll() {
        return forumRepository.findAll();
    }

    @Override
    public ForumEntity getById(Long id) {
        Optional<ForumEntity> forumEntity = forumRepository.findById(id);
        return forumEntity.orElse(null);
    }

    @Override
    public void save(ForumEntity entity) {
      this.ForumRepository.save(entity);
    }

    @Override
    public void update(ForumEntity entity) {
      this.ForumRepository.save(entity);
    }

    @Override
    public void delete(ForumEntity entity) {
     this.ForumRepository.delete(entity);
    }

    @Override
    public void create(ForumEntity entity) {
      this.ForumRepository.save(entity);
    }

    @Override
    public void delete(Long id) {

    }
}
