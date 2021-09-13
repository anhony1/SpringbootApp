package com.example.demo.teacher.data.repository;

import com.example.demo.teacher.data.entity.TeacherTestDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TeacherDtoTestRepository extends JpaRepository<TeacherTestDto, Integer> {
}
