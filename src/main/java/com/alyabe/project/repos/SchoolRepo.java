package com.alyabe.project.repos;

import com.alyabe.project.mappers.StudentRowMapper;
import com.alyabe.project.mappers.TeacherMapper;
import com.alyabe.project.POJOs.Student;
import com.alyabe.project.POJOs.StudentDTO;
import com.alyabe.project.POJOs.Teacher;
import com.alyabe.project.POJOs.TeacherDTOtoFind;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class SchoolRepo {
    private final JdbcTemplate jdbcTemplate;

    public SchoolRepo(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public void addStudent(Student student){
        jdbcTemplate.update("INSERT INTO student VALUES (Null, ?, ?, NULL)", student.getName(),
                student.getGrade());
    }

    public void addTeacher(TeacherDTOtoFind teacher){
        jdbcTemplate.update("INSERT INTO teacher VALUES (Null, ?, ?)", teacher.getName(), teacher.getSubject());
    }

    public List<Teacher> findAllTeachers(){
        return jdbcTemplate.query("SELECT * FROM Teacher", new TeacherMapper());
    }

    public List<Student> getTeacherStudents(Teacher teacher){
        return jdbcTemplate.query("Select * from student WHERE teacher_id=?", new StudentRowMapper(), teacher.getId());
    }

    public Teacher getInfoTeacher(String nameT, String subjectT){
        return jdbcTemplate.queryForObject("SELECT * FROM Teacher WHERE name = ? and subject = ?", new TeacherMapper(), nameT, subjectT);
    }

    public Student getInfoStudent(StudentDTO student){
        return jdbcTemplate.queryForObject("SELECT * FROM Student WHERE name = ? and grade =?", new StudentRowMapper(), student.getName(), student.getGrade());
    }

    public void updateStudent(Student student){
        jdbcTemplate.update("Update student SET  teacher_id=? where id=?", student.getTeacher_id(), student.getId());
    }
}
