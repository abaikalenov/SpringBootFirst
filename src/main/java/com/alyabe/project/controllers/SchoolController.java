package com.alyabe.project.controllers;

import com.alyabe.project.POJOs.*;
import com.alyabe.project.repos.SchoolRepo;
import com.alyabe.project.services.SchoolService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/school")
@Tag(name = "ендпоинты", description = "все ендпоинты контроллера")
public class SchoolController {
    private final SchoolRepo schoolRepo;
    private final SchoolService schoolService;

    public SchoolController(SchoolRepo schoolRepo, SchoolService schoolService) {
        this.schoolRepo = schoolRepo;
        this.schoolService = schoolService;
    }

    @PostMapping("/addTeacher")
    @Operation(summary = "устазды косу", description = "ustazdy derekter qoryna qosy")
    public void addTeacher(@RequestBody TeacherDTOtoFind teacher){
        schoolRepo.addTeacher(teacher);
    }

    @GetMapping("/teacher")
    @Operation(summary = "barlik ustazdy koru", description = "derekter qorynda  qansha ustaz bar ekenin koru")
    public List<Teacher> allStudents(){
        return schoolRepo.findAllTeachers();
    }

    @GetMapping("/listTeacher")
    @Operation(summary = "belgigl ustaz zhail info", description = "kai panner beredi, kandai okushilary bar")
    public TeacherDTO listTeacher(@RequestParam String nameT, @RequestParam String subjectT){
        return schoolService.getInfoTeacher(nameT, subjectT);
    }

    @PostMapping("/addStudent")
    @Operation(summary = "okushy kosy", description = "-")

    public void addStudent(@RequestBody Student student){
        schoolRepo.addStudent(student);
    }

    @PutMapping("/updateStudent")
    @Operation(summary = "ustaz okushy tandaidy", description = "dereketer qorinda zhana okyshyda mugalim bolmaidy")
    public void updateStudent(@RequestParam String nameT, @RequestParam String subjectT, @RequestBody StudentDTO student){
        schoolService.updateStudent(nameT, subjectT, student);
    }




}
