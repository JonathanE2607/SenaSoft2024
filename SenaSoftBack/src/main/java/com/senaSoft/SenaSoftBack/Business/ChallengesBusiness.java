package com.senaSoft.SenaSoftBack.Business;

import com.senaSoft.SenaSoftBack.Dto.ChallengeDto;
import com.senaSoft.SenaSoftBack.Dto.PeopleDto;
import com.senaSoft.SenaSoftBack.Entities.ChallengesEntity;
import com.senaSoft.SenaSoftBack.Entities.PeopleEntity;
import com.senaSoft.SenaSoftBack.Services.ChallengesService;
import com.senaSoft.SenaSoftBack.Services.PeopleService;
import com.senaSoft.SenaSoftBack.utilities.CustomException;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ChallengesBusiness {
    @Autowired
    private ChallengesService challengesService;
    private final ModelMapper modelMapper = new ModelMapper();

    public List<ChallengeDto> findAll() {
        try{
            List<ChallengesEntity> challengesEntityList = challengesService.findAll();
            List<ChallengeDto> challengeDtoList = new ArrayList<>();

            for (ChallengesEntity challengue : challengesEntityList) {
                challengeDtoList.add(modelMapper.map(challengue, ChallengeDto.class));
            }
            return challengeDtoList;
        } catch (Exception e) {
            throw new CustomException("Error al crear el servicio", e);
        }

    }

    public void create (ChallengeDto challengueDto){
        try{
            ChallengesEntity challengesEntity = modelMapper.map(challengueDto, ChallengesEntity.class);
            challengesService.save(challengesEntity);
        }catch (CustomException e){
            throw new CustomException("Error al crear el servicio",  e);
        }
    }

    public void update (Long id, ChallengeDto challengeDto){
        try{
            ChallengesEntity challengesEntity = challengesService.getById(id);
            challengesEntity.setName_Challenge(challengeDto.getName_Challenge());
            challengesEntity.setDescription(challengeDto.getDescription());
            challengesEntity.setForum_Challengues(challengeDto.getForum_Challengues());
            challengesEntity.setDescription(challengeDto.getDescription());


            challengesService.update(challengesEntity);
        }catch (CustomException e){
            throw new CustomException("Error al actualizar el servicio",  e);
        }
    }

    public void delete (ChallengesEntity entity){
        try{
            challengesService.delete(entity);
        }catch (CustomException e){
            throw new CustomException("Error al eliminar el servicio",  e);
        }
    }

}
