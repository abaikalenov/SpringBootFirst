package com.alyabe.project.services;

import com.alyabe.project.POJOs.Student;
import com.alyabe.project.POJOs.StudentDTO;
import com.alyabe.project.POJOs.Teacher;
import com.alyabe.project.POJOs.TeacherDTO;
import com.alyabe.project.repos.SchoolRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SchoolService {
    private final SchoolRepo schoolRepo;

    public SchoolService(SchoolRepo schoolRepo) {
        this.schoolRepo = schoolRepo;
    }

    public TeacherDTO getInfoTeacher(String nameT, String subjectT){
        Teacher teacher = schoolRepo.getInfoTeacher(nameT, subjectT);
        List<Student> listStudents = schoolRepo.getTeacherStudents(teacher);
        return new TeacherDTO(teacher.getName(), teacher.getSubject(), listStudents);
    }

    public void updateStudent(String nameT, String subjectT, StudentDTO studentDTO){
        int n = schoolRepo.getInfoTeacher(nameT, subjectT).getId();
        Student student = schoolRepo.getInfoStudent(studentDTO);
        student.setTeacher_id(n);
        schoolRepo.updateStudent(student);
    }
}
