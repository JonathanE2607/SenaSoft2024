package com.senaSoft.SenaSoftBack.Controller;

import com.senaSoft.SenaSoftBack.Business.PostBusiness;
import com.senaSoft.SenaSoftBack.Dto.PostDto;
import com.senaSoft.SenaSoftBack.Entities.PostEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/post")
public class PostController {
    @Autowired
    private PostBusiness postBusiness;

    @GetMapping("/all")
    public List<PostDto> getAllPost(){
        return postBusiness.findAll();
    }

    @PostMapping("/create")
    public void createPost(@RequestBody PostDto post){
        postBusiness.create(post);
    }

    @PutMapping("/update/{id}")
    public void updatePost(Long id, @RequestBody PostDto post){
       postBusiness.update(id, post);
    }

    @DeleteMapping("/delete/{id}")
    public void deletePeople(@PathVariable("id") PostEntity entity){
        postBusiness.delete(entity);
    }
}
