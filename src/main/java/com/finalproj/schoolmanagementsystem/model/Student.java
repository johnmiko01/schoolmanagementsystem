package com.finalproj.schoolmanagementsystem.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Student {



    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int studentid;
    private String studentname;
    private String studentaddress;
    private String studentusername;
    private String studentpassword;


    private String studentsubject;

    public String getStudentsubject() {
        return studentsubject;
    }

    public void setStudentsubject(String studentsubject) {
        this.studentsubject = studentsubject;
    }


    public int getStudentid() {
        return studentid;
    }

    public void setStudentid(int studentid) {
        this.studentid = studentid;
    }

    public String getStudentname() {
        return studentname;
    }

    public void setStudentname(String studentname) {
        this.studentname = studentname;
    }

    public String getStudentaddress() {
        return studentaddress;
    }

    public void setStudentaddress(String studentaddress) {
        this.studentaddress = studentaddress;
    }

    public String getStudentusername() {
        return studentusername;
    }

    public void setStudentusername(String studentusername) {
        this.studentusername = studentusername;
    }

    public String getStudentpassword() {
        return studentpassword;
    }

    public void setStudentpassword(String studentpassword) {
        this.studentpassword = studentpassword;
    }

    public Student() {
    }

}
