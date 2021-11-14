package com.finalproj.schoolmanagementsystem.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Teacher {



    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int teacherid;
    private String teachername;
    private String teacherpassword;
    private String teacherusername;
    public int getTeacherid() {
        return teacherid;
    }

    public void setTeacherid(int teacherid) {
        this.teacherid = teacherid;
    }

    public String getTeachername() {
        return teachername;
    }

    public void setTeachername(String teachername) {
        this.teachername = teachername;
    }

    public String getTeacherpassword() {
        return teacherpassword;
    }

    public void setTeacherpassword(String teacherpassword) {
        this.teacherpassword = teacherpassword;
    }

    public String getTeacherusername() {
        return teacherusername;
    }

    public void setTeacherusername(String teacherusername) {
        this.teacherusername = teacherusername;
    }

    public Teacher() {
    }

}
