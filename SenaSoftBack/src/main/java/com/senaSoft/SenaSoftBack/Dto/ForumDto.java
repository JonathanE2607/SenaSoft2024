package com.senaSoft.SenaSoftBack.Dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class ForumDto {

    private Long id_Forum;
    private Long document_User;
    private String details;
    private Long post_Id;
}
