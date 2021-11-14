package com.finalproj.schoolmanagementsystem.Service;

import com.finalproj.schoolmanagementsystem.model.Parent;
import com.finalproj.schoolmanagementsystem.model.Teacher;
import com.finalproj.schoolmanagementsystem.repository.ParentRepository;
import com.finalproj.schoolmanagementsystem.repository.TeacherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ParentServiceImpl implements ParentService{
    @Autowired
    private ParentRepository parentRepository;
    @Override
    public Parent saveParent(Parent parent){
        return parentRepository.save(parent);
    }
}
