package com.senaSoft.SenaSoftBack.Controller;

import com.senaSoft.SenaSoftBack.Business.PeopleBusiness;
import com.senaSoft.SenaSoftBack.Dto.PeopleDto;
import com.senaSoft.SenaSoftBack.Entities.PeopleEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping(path = "api/v1/people")
public class PeopleController {


        @Autowired
        private PeopleBusiness peopleBusiness;

        @GetMapping("/all")
        public List<PeopleDto> getAllPeople(){
            return peopleBusiness.findAll();
        }

        @PostMapping("/create")
        public void createPeople(@RequestBody PeopleDto people){
            peopleBusiness.create(people);
        }

        @PutMapping("/update/{id}")
        public void updatePeople(Long id, @RequestBody PeopleDto people){
            peopleBusiness.update(id, people);
        }

        @DeleteMapping("/delete/{id}")
        public void deletePeople(@PathVariable("id") PeopleEntity entity){
            peopleBusiness.delete(entity);
        }

    }
