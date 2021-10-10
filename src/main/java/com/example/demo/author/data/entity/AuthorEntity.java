package com.example.demo.author.data.entity;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;
@Data
@Entity
@Table(name = "author")
@AllArgsConstructor
@NoArgsConstructor
public class AuthorEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String firstName;
    private String lastName;
    private LocalDate dateOfBirth;
    private String gender;

//    private Integer posts;
//    private Integer comments;
//    private Integer likes;



}
