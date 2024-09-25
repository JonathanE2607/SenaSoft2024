package com.senaSoft.SenaSoftBack.Business;

import com.senaSoft.SenaSoftBack.Dto.ChallengeDto;
import com.senaSoft.SenaSoftBack.Dto.LikeDto;
import com.senaSoft.SenaSoftBack.Entities.ChallengesEntity;
import com.senaSoft.SenaSoftBack.Entities.LikeEntity;
import com.senaSoft.SenaSoftBack.Services.LikeService;
import com.senaSoft.SenaSoftBack.utilities.CustomException;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class LikeBusiness {
    @Autowired
    private LikeService likeService;

    private final ModelMapper modelMapper = new ModelMapper();

    public List<LikeDto> findAll() {
        try{
            List<LikeEntity> likeEntityList = likeService.findAll();
            List<LikeDto> likeDtoList = new ArrayList<>();

            for (LikeEntity like : likeEntityList) {
                likeDtoList.add(modelMapper.map(like, LikeDto.class));
            }
            return likeDtoList;
        } catch (Exception e) {
            throw new CustomException("Error al crear el servicio", e);
        }

    }

    public void create (LikeDto likeDto){
        try{
            LikeEntity likeEntity = modelMapper.map(likeDto, LikeEntity.class);
            likeService.save(likeEntity);
        }catch (CustomException e){
            throw new CustomException("Error al crear el servicio",  e);
        }
    }

    public void update (Long id, LikeDto likeDto){
        try{
           LikeEntity likeEntity = likeService.getById(id);
            likeEntity.setUser_Id(likeDto.getUser_Id());
            likeEntity.setId_Public(likeDto.getId_Like());

            likeService.update(likeEntity);
        }catch (CustomException e){
            throw new CustomException("Error al actualizar el servicio",  e);
        }
    }

    public void delete (LikeEntity entity){
        try{
            likeService.delete(entity);
        }catch (CustomException e){
            throw new CustomException("Error al eliminar el servicio",  e);
        }
    }
}
