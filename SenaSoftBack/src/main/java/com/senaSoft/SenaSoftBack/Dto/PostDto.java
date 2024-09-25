package com.senaSoft.SenaSoftBack.Dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class PostDto {
    private Long post_Id;
    private String description;
    private Date date;
    private String file;
    private Long user_Id;
    private Long forum_Id;
    private Long like_Id;
}
