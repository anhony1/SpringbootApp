package com.example.demo.teacher.web;

import com.example.demo.teacher.business.TeacherService;
import com.example.demo.teacher.data.entity.Teacher;
import com.example.demo.teacher.data.entity.TeacherTestDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/Teacher")
public class TeacherController {

    private final TeacherService teacherService;

    public TeacherController(TeacherService teacherService){
        this.teacherService = teacherService;
    }

    @GetMapping
    public List<Teacher> getTeachers(){
        return teacherService.getTeachers();
    }

    @RequestMapping(path = "/test")
    public List<TeacherTestDto> getDtoTest(){
        return teacherService.getDtoTest();
    }



}
