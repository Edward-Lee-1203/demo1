package com.dut.demo.controller;

import com.dut.demo.model.Teacher;
import com.dut.demo.service.TeacherService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("api/teacher")
public class TeacherController {

    private final TeacherService teacherService;

    public TeacherController(TeacherService teacherService) {
        this.teacherService = teacherService;
    }

    @GetMapping
    public ResponseEntity getTeachers() {
        return new ResponseEntity<>(teacherService.getTeachers(), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity addTeacher(@RequestBody Teacher teacher) {
        return new ResponseEntity<>(teacherService.addTeacher(teacher), HttpStatus.CREATED);
    }

    @DeleteMapping("{id}")
    public ResponseEntity deleteTeacher(@PathVariable long id) {
        teacherService.deleteTeacherById(id);
        return new ResponseEntity<>("Delete successfully!", HttpStatus.OK);
    }

    @PutMapping
    public ResponseEntity updateTeacher(@RequestBody Teacher teacher) {
        return new ResponseEntity<>(teacherService.updateTeacher(teacher), HttpStatus.OK);
    }
}
