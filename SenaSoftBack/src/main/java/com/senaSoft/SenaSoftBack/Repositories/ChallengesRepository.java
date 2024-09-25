package com.senaSoft.SenaSoftBack.Repositories;

import com.senaSoft.SenaSoftBack.Entities.ChallengesEntity;
import com.senaSoft.SenaSoftBack.Services.Dao.Idao;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ChallengesRepository extends JpaRepository<ChallengesEntity, Long> {
}
