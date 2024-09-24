package com.senaSoft.SenaSoftBack.Entities;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@NoArgsConstructor
@Entity
@Getter
@Setter
@Table(name = "peoples")
public class PeopleEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_people")
    private Long id_People;


    @Column(name = "name")
    private String name;

    @Column(name = "last_name")
    private String last_Name;

    @Column(name = "document")
    private Long document;

}
