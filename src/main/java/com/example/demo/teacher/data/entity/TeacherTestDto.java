package com.example.demo.teacher.data.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.UUID;


@Data
@Entity
@Table(name = "Teacher")
@AllArgsConstructor
@NoArgsConstructor
public class TeacherTestDto {

    @Id
    private UUID id;
    private String firstName;
    private String lastName;
    private String email;

}
