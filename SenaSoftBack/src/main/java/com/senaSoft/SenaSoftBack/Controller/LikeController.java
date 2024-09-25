package com.senaSoft.SenaSoftBack.Controller;


import com.senaSoft.SenaSoftBack.Business.LikeBusiness;
import com.senaSoft.SenaSoftBack.Dto.LikeDto;
import com.senaSoft.SenaSoftBack.Entities.LikeEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/likes")
public class LikeController {
    @Autowired
    private LikeBusiness likeBusiness;

    @GetMapping("/all")
    public List<LikeDto> getAllLikes(){
        return likeBusiness.findAll();
    }

    @PostMapping("/create")
    public void createLikes(@RequestBody LikeDto like){
        likeBusiness.create(like);
    }

    @PutMapping("/update/{id}")
    public void updateLikes(Long id, @RequestBody LikeDto like){
        likeBusiness.update(id, like);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteLikes(@PathVariable("id") LikeEntity entity){
        likeBusiness.delete(entity);
    }
}
