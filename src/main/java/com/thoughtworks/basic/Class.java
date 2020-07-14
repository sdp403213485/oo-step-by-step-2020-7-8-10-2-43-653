package com.thoughtworks.basic;

import java.util.List;

public class Class {
    private Teacher teacher;
    private List<Student> student;
    private String classNumber;

    public Class(Teacher teacher, List<Student> student, String classNumber) {
        this.teacher = teacher;
        this.student = student;
        this.classNumber = classNumber;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public List<Student> getStudent() {
        return student;
    }

    public void setStudent(List<Student> student) {
        this.student = student;
    }

    public String getClassNumber() {
        return classNumber;
    }

    public void setClassNumber(String classNumber) {
        this.classNumber = classNumber;
    }
}
