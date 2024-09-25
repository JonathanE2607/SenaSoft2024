package com.senaSoft.SenaSoftBack.Controller;

import com.senaSoft.SenaSoftBack.Business.ChallengesBusiness;
import com.senaSoft.SenaSoftBack.Dto.ChallengeDto;
import com.senaSoft.SenaSoftBack.Entities.ChallengesEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/challengues")
public class ChallengesController {

    @Autowired
    private ChallengesBusiness challengesBusiness;

    @GetMapping("/all")
    public List<ChallengeDto> getAllChallengues(){
        return challengesBusiness.findAll();
    }

    @PostMapping("/create")
    public void createChallengues(@RequestBody ChallengeDto challengue){
        challengesBusiness.create(challengue);
    }

    @PutMapping("/update/{id}")
    public void updateChallengues(Long id, @RequestBody ChallengeDto challengue){
        challengesBusiness.update(id, challengue);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteChallengues(@PathVariable("id") ChallengesEntity entity){
        challengesBusiness.delete(entity);
    }
}
