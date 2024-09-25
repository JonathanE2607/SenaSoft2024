package com.senaSoft.SenaSoftBack.Services;

import com.senaSoft.SenaSoftBack.Entities.ChallengesEntity;
import com.senaSoft.SenaSoftBack.Repositories.ChallengesRepository;
import com.senaSoft.SenaSoftBack.Services.Dao.Idao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ChallengesService implements Idao<ChallengesEntity, Long> {
    @Autowired
    private ChallengesRepository challengeRepository;

    @Override
    public List<ChallengesEntity> findAll() {
        return challengeRepository.findAll();
    }

    @Override
    public ChallengesEntity getById(Long id) {
        Optional<ChallengesEntity> optional = challengeRepository.findById(id);
        return optional.orElse(null);
    }

    @Override
    public void save(ChallengesEntity entity) {
      this.challengeRepository.save(entity);
    }

    @Override
    public void update(ChallengesEntity entity) {
     this.challengeRepository.save(entity);
    }

    @Override
    public void delete(ChallengesEntity entity) {
     this.challengeRepository.delete(entity);
    }

    @Override
    public void create(ChallengesEntity entity) {
     this.challengeRepository.save(entity);
    }

    @Override
    public void delete(Long id) {

    }
}
