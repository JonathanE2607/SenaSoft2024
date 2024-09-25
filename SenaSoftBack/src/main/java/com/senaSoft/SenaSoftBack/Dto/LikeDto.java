package com.senaSoft.SenaSoftBack.Dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class LikeDto {
    private Long id_Like;
    private Long user_Id;
    private Long id_Post;
}
