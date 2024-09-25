package com.senaSoft.SenaSoftBack.Services;

import com.senaSoft.SenaSoftBack.Entities.LikeEntity;
import com.senaSoft.SenaSoftBack.Repositories.LikeRepository;
import com.senaSoft.SenaSoftBack.Services.Dao.Idao;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LikeService implements Idao<LikeEntity, Long> {
    private LikeRepository likeRepository;

    @Override
    public List<LikeEntity> findAll() {
        return likeRepository.findAll();
    }

    @Override
    public LikeEntity getById(Long id) {
        Optional<LikeEntity> likeEntity = likeRepository.findById(id);
        return likeEntity.orElse(null);
    }

    @Override
    public void save(LikeEntity entity) {
     this.likeRepository.save(entity);
    }

    @Override
    public void update(LikeEntity entity) {
       this.likeRepository.save(entity);
    }

    @Override
    public void delete(LikeEntity entity) {
      this.likeRepository.delete(entity);
    }

    @Override
    public void create(LikeEntity entity) {
            this.likeRepository.save(entity);
    }

    @Override
    public void delete(Long id) {

    }
}
