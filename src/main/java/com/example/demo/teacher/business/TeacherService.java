package com.example.demo.teacher.business;

import com.example.demo.teacher.data.entity.Teacher;
import com.example.demo.teacher.data.entity.TeacherTestDto;
import com.example.demo.teacher.data.repository.TeacherDtoTestRepository;
import com.example.demo.teacher.data.repository.TeacherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TeacherService {

    private final TeacherRepository teacherRepository;
    private final TeacherDtoTestRepository teacherDtoTestRepository;

    @Autowired
    public TeacherService(TeacherRepository teacherRepository, TeacherDtoTestRepository teacherDtoTestRepository) {
        this.teacherRepository = teacherRepository;
        this.teacherDtoTestRepository = teacherDtoTestRepository;
    }


    public List<Teacher> getTeachers(){
        return teacherRepository.findAll();
    }

    public void addNewReader(Teacher teacher) {
        Optional<Teacher> readerOptional = teacherRepository.findReaderByEmail(teacher.getEmail());
        if(readerOptional.isPresent()){
            throw new IllegalStateException("Email taken");
        }
        teacherRepository.save(teacher);
    }
    //seeing how to create DTO objects to return only things that I want to see
    public List<TeacherTestDto> getDtoTest() {
        return teacherDtoTestRepository.findAll();
    }
}
