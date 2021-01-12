package com.dut.demo.service;

import com.dut.demo.model.Faculty;

import java.util.List;

public interface FacultyService {
    Faculty addFaculty(Faculty faculty);
    List<Faculty> getFacultys();
    void deleteFacultyById(long id);
    Faculty updateFaculty(Faculty faculty);
}
