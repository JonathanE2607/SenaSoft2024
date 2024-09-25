package com.senaSoft.SenaSoftBack.Business;

import com.senaSoft.SenaSoftBack.Dto.PostDto;
import com.senaSoft.SenaSoftBack.Entities.PostEntity;
import com.senaSoft.SenaSoftBack.Services.PostService;
import com.senaSoft.SenaSoftBack.utilities.CustomException;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class PostBusiness {
    @Autowired
    private PostService postService;

    private final ModelMapper modelMapper = new ModelMapper();

    public List<PostDto> findAll() {
        try{
            List<PostEntity> postEntityList = postService.findAll();
            List<PostDto> postDtoList = new ArrayList<>();

            for (PostEntity post : postEntityList) {
               postDtoList.add(modelMapper.map(post, PostDto.class));
            }
            return postDtoList;
        } catch (Exception e) {
            throw new CustomException("Error al crear el servicio", e);
        }

    }

    public void create (PostDto postDto){
        try{
            PostEntity postEntity = modelMapper.map(postDto, PostEntity.class);
            postService.save(postEntity);
        }catch (CustomException e){
            throw new CustomException("Error al crear el servicio",  e);
        }
    }

    public void update (Long id, PostDto postDto){
        try{
            PostEntity postEntity = postService.getById(id);
            postDto.setDate(postEntity.getDate());
            postDto.setDescription(postDto.getDescription());
            postDto.setFile(postDto.getFile());
            postDto.setUser_Id(postDto.getUser_Id());
            postDto.setForum_Id(postDto.getForum_Id());
            postDto.setLike_Id(postDto.getLike_Id());
        }catch (CustomException e){
            throw new CustomException("Error al actualizar el servicio",  e);
        }
    }

    public void delete (PostEntity entity){
        try{
            postService.delete(entity);
        }catch (CustomException e){
            throw new CustomException("Error al eliminar el servicio",  e);
        }
    }
}
