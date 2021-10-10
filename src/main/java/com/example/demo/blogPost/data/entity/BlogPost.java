package com.example.demo.blogPost.data.entity;

import lombok.*;
import org.hibernate.Hibernate;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDate;
import java.util.Objects;

@Getter
@Setter
@ToString
@RequiredArgsConstructor
@Entity
@Table(name = "blogPost")
@AllArgsConstructor
public class BlogPost {

    @Id
    private Integer id;
    private String title;
    private String postAuthor;
    private LocalDate dateCreated;
    private String textBody;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        BlogPost blogPost = (BlogPost) o;
        return Objects.equals(id, blogPost.id);
    }

    @Override
    public int hashCode() {
        return 0;
    }
}
