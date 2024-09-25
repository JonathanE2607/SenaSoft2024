package com.senaSoft.SenaSoftBack.Entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Entity
@Getter
@Setter
@Table(name = "likes")
public class LikeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_Like")
    private Long id_Like;

    @Column(name = "user_Id")
    private Long user_Id;

    @Column(name = "id_Public")
    private Long id_Public;
}
