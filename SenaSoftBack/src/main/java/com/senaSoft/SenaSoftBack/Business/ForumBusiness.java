package com.senaSoft.SenaSoftBack.Business;

import com.senaSoft.SenaSoftBack.Dto.ForumDto;
import com.senaSoft.SenaSoftBack.Entities.ForumEntity;
import com.senaSoft.SenaSoftBack.Services.ForumService;
import com.senaSoft.SenaSoftBack.utilities.CustomException;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ForumBusiness {
    @Autowired
    private ForumService forumService;

    private final ModelMapper modelMapper = new ModelMapper();

    public List<ForumDto> findAll() {
        try{
            List<ForumEntity> forumEntityList = forumService.findAll();
            List<ForumDto> forumDtoList = new ArrayList<>();

            for (ForumEntity forum : forumEntityList) {
                forumDtoList.add(modelMapper.map(forum, ForumDto.class));
            }
            return forumDtoList;
        } catch (Exception e) {
            throw new CustomException("Error al crear el servicio", e);
        }

    }

    public void create (ForumDto forumDto){
        try{
           ForumEntity forumEntity = modelMapper.map(forumDto, ForumEntity.class);
            forumService.save(forumEntity);
        }catch (CustomException e){
            throw new CustomException("Error al crear el servicio",  e);
        }
    }

    public void update (Long id, ForumDto forumDto){
        try{
            ForumEntity forumEntity = forumService.getById(id);
            forumEntity.setDetails(forumDto.getDetails());
            forumEntity.setDocument_User(forumDto.getDocument_User());
            forumEntity.setPost_Id(forumDto.getPost_Id());


            forumService.update(forumEntity);
        }catch (CustomException e){
            throw new CustomException("Error al actualizar el servicio",  e);
        }
    }

    public void delete (ForumEntity entity){
        try{
            forumService.delete(entity);
        }catch (CustomException e){
            throw new CustomException("Error al eliminar el servicio",  e);
        }
    }
}
