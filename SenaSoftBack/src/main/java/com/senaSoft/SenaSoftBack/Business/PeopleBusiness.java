package com.senaSoft.SenaSoftBack.Business;
import com.senaSoft.SenaSoftBack.Dto.PeopleDto;
import com.senaSoft.SenaSoftBack.Entities.PeopleEntity;
import com.senaSoft.SenaSoftBack.Services.PeopleService;
import com.senaSoft.SenaSoftBack.utilities.CustomException;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class PeopleBusiness {
    @Autowired
    private PeopleService userService;

    private final ModelMapper modelMapper = new ModelMapper();
    @Autowired
    private PeopleService peopleService;

    public List<PeopleDto> findAll() {
        try{
            List<PeopleEntity> peopleEntityList = userService.findAll();
            List<PeopleDto> peopleDtoList = new ArrayList<>();

            for (PeopleEntity people : peopleEntityList) {
                peopleDtoList.add(modelMapper.map(people, PeopleDto.class));
            }
            return peopleDtoList;
        } catch (Exception e) {
            throw new CustomException("Error al crear el servicio", e);
        }

    }

    public void create (PeopleDto peopleDto){
        try{
            PeopleEntity usersEntity = modelMapper.map(peopleDto, PeopleEntity.class);
            userService.save(usersEntity);
        }catch (CustomException e){
            throw new CustomException("Error al crear el servicio",  e);
        }
    }

    public void update (Long id, PeopleDto peopleDto){
        try{
            PeopleEntity peopleEntity = peopleService.getById(id);
            peopleEntity.setId_People(peopleDto.getId_people());
            peopleEntity.setName(peopleDto.getName());
            peopleEntity.setLast_Name(peopleDto.getLastname());
            peopleEntity.setDocument(peopleDto.getDocument());

            peopleService.update(peopleEntity);
        }catch (CustomException e){
            throw new CustomException("Error al actualizar el servicio",  e);
        }
    }

    public void delete (PeopleEntity entity){
        try{
            peopleService.delete(entity);
        }catch (CustomException e){
            throw new CustomException("Error al eliminar el servicio",  e);
        }
    }

}
