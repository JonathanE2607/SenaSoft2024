package com.senaSoft.SenaSoftBack.Repositories;

import com.senaSoft.SenaSoftBack.Entities.PeopleEntity;
import com.senaSoft.SenaSoftBack.Service.Dao.Idao;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PeopleRepository extends JpaRepository<PeopleEntity, Long> {
}
