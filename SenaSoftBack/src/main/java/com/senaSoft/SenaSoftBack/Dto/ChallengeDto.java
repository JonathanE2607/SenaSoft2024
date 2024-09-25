package com.senaSoft.SenaSoftBack.Dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class ChallengeDto {
    private int id_Challenge;
    private String name_Challenge;
    private String description;
    private String forum_Challengues;
}
