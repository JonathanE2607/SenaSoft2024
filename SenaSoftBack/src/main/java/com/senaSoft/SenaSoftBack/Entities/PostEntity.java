package com.senaSoft.SenaSoftBack.Entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.sql.Date;

@NoArgsConstructor
@Entity
@Getter
@Setter
@Table(name = "Posts")
public class PostEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "post_Id")
    private Long post_Id;

    @Column(name = "description")
    private String description;

    @Column(name = "date")
    private Date date;

    @Column(name = "file")
    private String file;

    @Column(name = "User_Id")
    private Long User_Id;

    @Column(name = "forum_Id")
    private Long forum_Id;

    @Column(name = "like_Id")
    private Long like_Id;
}
