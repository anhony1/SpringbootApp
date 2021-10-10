package com.example.demo.teacher.data.repository;

import com.example.demo.teacher.data.entity.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import org.springframework.stereotype.Repository;

import java.util.Optional;


@Repository
public interface TeacherRepository extends JpaRepository<Teacher, Integer> {

    @Query("SELECT r FROM Teacher r WHERE r.email = ?1")
    Optional<Teacher> findReaderByEmail(String email);

    

}
