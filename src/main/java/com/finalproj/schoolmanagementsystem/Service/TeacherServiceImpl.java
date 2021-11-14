package com.finalproj.schoolmanagementsystem.Service;

import com.finalproj.schoolmanagementsystem.model.Student;
import com.finalproj.schoolmanagementsystem.model.Teacher;
import com.finalproj.schoolmanagementsystem.repository.StudentRepository;
import com.finalproj.schoolmanagementsystem.repository.TeacherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TeacherServiceImpl implements TeacherService{
    @Autowired
    private TeacherRepository teacherRepository;
    @Override
    public Teacher saveTeacher(Teacher teacher){
        return teacherRepository.save(teacher);
    }
}
