package com.senaSoft.SenaSoftBack.Services;

import com.senaSoft.SenaSoftBack.Entities.PeopleEntity;
import com.senaSoft.SenaSoftBack.Repositories.PeopleRepository;
import com.senaSoft.SenaSoftBack.Services.Dao.Idao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PeopleService implements Idao<PeopleEntity, Long> {
@Autowired
private PeopleRepository peopleRepository;


    @Override
    public List<PeopleEntity> findAll() {
        return peopleRepository.findAll();
    }

    @Override
    public PeopleEntity getById(Long id) {
        Optional<PeopleEntity> optionalPeopleEntity = peopleRepository.findById(id);
        return optionalPeopleEntity.orElse(null);
    }

    @Override
    public void save(PeopleEntity entity) {
      this.peopleRepository.save(entity);
    }

    @Override
    public void update(PeopleEntity entity) {
     this.peopleRepository.save(entity);
    }

    @Override
    public void delete(PeopleEntity entity) {
      this.peopleRepository.delete(entity);
    }

    @Override
    public void create(PeopleEntity entity) {
      this.peopleRepository.save(entity);
    }

    @Override
    public void delete(Long id) {

    }
}
