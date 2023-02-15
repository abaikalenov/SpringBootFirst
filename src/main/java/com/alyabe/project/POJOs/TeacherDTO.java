package com.alyabe.project.POJOs;

import java.util.List;

public class TeacherDTO {
    private String name;
    private String subject;
    private List<Student> studentList;

    public TeacherDTO(String name, String subject, List<Student> studentList) {
        this.name = name;
        this.subject = subject;
        this.studentList = studentList;
    }

    public TeacherDTO() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public List<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(List<Student> studentList) {
        this.studentList = studentList;
    }

    @Override
    public String toString() {
        return "TeacherDTO{" +
                "name='" + name + '\'' +
                ", subject='" + subject + '\'' +
                ", studentList=" + studentList +
                '}';
    }
}
