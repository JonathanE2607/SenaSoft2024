package com.senaSoft.SenaSoftBack.Dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class PeopleDto {
    private Long id_people;
    private String name;
    private String lastname;
    private Long document;
}
