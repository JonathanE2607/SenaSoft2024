package com.senaSoft.SenaSoftBack.Entities;

import jakarta.persistence.*;
import jdk.jfr.Enabled;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Entity
@Getter
@Setter
@Table(name = "challenges")
public class ChallengesEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_challenge")
    private Long id_Challenge;

    @Column(name = "name_challenge")
    private String name_Challenge;

    @Column(name = "description")
    private String description;

    @Column(name = "forum_challengues")
    private String forum_Challengues;
}
