package com.example.demo.teacher.data.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.UUID;

@Data
@Entity
@Table(name = "Teacher")
@AllArgsConstructor
@NoArgsConstructor
public class Teacher {
    @Id
//    //TODO: Figure out exactly what this does
//    @SequenceGenerator(
//            name="reader_sequence",
//            sequenceName = "reader_sequence",
//            allocationSize = 1
//    )
//    @GeneratedValue(
//            strategy = GenerationType.SEQUENCE,
//            generator = "reader_sequence"
//    )
    private UUID id;
    private String firstName;
    private String lastName;
    private String email;
    private String gender;
    private LocalDate dob;
    private String department;
    private String officeNumber;
    private String pictureUrl;

}
