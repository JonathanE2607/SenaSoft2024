package com.senaSoft.SenaSoftBack.Controller;

import com.senaSoft.SenaSoftBack.Business.ForumBusiness;
import com.senaSoft.SenaSoftBack.Dto.ForumDto;
import com.senaSoft.SenaSoftBack.Entities.ForumEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/forum")
public class ForumController {
    @Autowired
    private ForumBusiness forumBusiness;

    @GetMapping("/all")
    public List<ForumDto> getAllChallengues(){
        return forumBusiness.findAll();
    }

    @PostMapping("/create")
    public void createChallengues(@RequestBody ForumDto forum){
        forumBusiness.create(forum);
    }

    @PutMapping("/update/{id}")
    public void updateChallengues(Long id, @RequestBody ForumDto forum){
        forumBusiness.update(id, forum);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteChallengues(@PathVariable("id") ForumEntity entity){
        forumBusiness.delete(entity);
    }
}
