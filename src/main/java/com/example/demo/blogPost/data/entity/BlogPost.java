package com.example.demo.blogPost.data.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDate;

@Data
@Entity
@Table(name = "blogPost")
@AllArgsConstructor
@NoArgsConstructor
public class BlogPost {

    @Id
    private Integer id;
    private String title;
    private String postAuthor;
    private LocalDate dateCreated;
    private String textBody;


}
