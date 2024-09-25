package com.senaSoft.SenaSoftBack.Entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@NoArgsConstructor
@Getter
@Setter
@Table(name = "forum")
public class ForumEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_Forum")
    private Long id_Forum;

    @Column(name = "document_User")
    private Long document_User;

    @Column(name = "details")
    private String details;

    @Column(name = "post_Id")
    private Long post_Id;
}
