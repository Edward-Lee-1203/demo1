package com.dut.demo.service;

import com.dut.demo.model.Teacher;

import java.util.List;

public interface TeacherService {
    Teacher addTeacher(Teacher teacher);
    List<Teacher> getTeachers();
    void deleteTeacherById(long id);
    Teacher updateTeacher(Teacher teacher);
}
