package com.dut.demo.service.impl;

import com.dut.demo.model.Faculty;
import com.dut.demo.repository.FacultyRepository;
import com.dut.demo.service.FacultyService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FacultyServiceImpl implements FacultyService {

    private final FacultyRepository facultyRepo;

    public FacultyServiceImpl(FacultyRepository facultyRepo) {
        this.facultyRepo = facultyRepo;
    }

    @Override
    public Faculty addFaculty(Faculty faculty) {
        return facultyRepo.save(faculty);
    }

    @Override
    public List<Faculty> getFacultys() {
        return (List<Faculty>) facultyRepo.findAll();
    }

    @Override
    public void deleteFacultyById(long id) {
        facultyRepo.deleteById(id);
    }

    @Override
    public Faculty updateFaculty(Faculty faculty) {
        return facultyRepo.save(faculty);
    }
}
