package com.dut.demo.service.impl;

import com.dut.demo.model.Teacher;
import com.dut.demo.repository.TeacherRepository;
import com.dut.demo.service.TeacherService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeacherServiceImpl implements TeacherService {

    private final TeacherRepository teacherRepository;

    public TeacherServiceImpl(TeacherRepository teacherRepository) {
        this.teacherRepository = teacherRepository;
    }

    @Override
    public Teacher addTeacher(Teacher teacher) {
        return teacherRepository.save(teacher);
    }

    @Override
    public List<Teacher> getTeachers() {
        return (List<Teacher>) teacherRepository.findAll();
    }

    @Override
    public void deleteTeacherById(long id) {
        teacherRepository.deleteById(id);
    }

    @Override
    public Teacher updateTeacher(Teacher teacher) {
        return teacherRepository.save(teacher);
    }
}
