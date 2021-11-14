package com.finalproj.schoolmanagementsystem.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Parent {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
        private int parentid;
        private String parentname;
        private String studentname;
        private String parentusername;
        private String parentpassword;

    public int getParentid() {
        return parentid;
    }

    public void setParentid(int parentid) {
        this.parentid = parentid;
    }

    public String getParentname() {
        return parentname;
    }

    public void setParentname(String parentname) {
        this.parentname = parentname;
    }

    public String getStudentname() {
        return studentname;
    }

    public void setStudentname(String studentname) {
        this.studentname = studentname;
    }

    public String getParentusername() {
        return parentusername;
    }

    public void setParentusername(String parentusername) {
        this.parentusername = parentusername;
    }

    public String getParentpassword() {
        return parentpassword;
    }

    public void setParentpassword(String parentpassword) {
        this.parentpassword = parentpassword;
    }

    public Parent() {
    }

}
