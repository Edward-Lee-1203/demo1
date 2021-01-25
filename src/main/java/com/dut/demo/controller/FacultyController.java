package com.dut.demo.controller;

import com.dut.demo.model.Faculty;
import com.dut.demo.service.FacultyService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("api/faculty")
public class FacultyController {

    private final FacultyService facultyService;

    public FacultyController(FacultyService facultyService) {
        this.facultyService = facultyService;
    }

    @GetMapping
    public ResponseEntity getFacultys() {
        return new ResponseEntity<>(facultyService.getFacultys(), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity addFaculty(@RequestBody Faculty faculty) {
        return new ResponseEntity<>(facultyService.addFaculty(faculty), HttpStatus.CREATED);
    }

    @DeleteMapping("{id}")
    public ResponseEntity deleteFaculty(@PathVariable long id) {
        facultyService.deleteFacultyById(id);
        return new ResponseEntity<>("Delete successfully!", HttpStatus.OK);
    }

    @PutMapping
    public ResponseEntity updateFaculty(@RequestBody Faculty faculty) {
        return new ResponseEntity<>(facultyService.updateFaculty(faculty), HttpStatus.OK);
    }

    @GetMapping("/all")
    public Iterable<Faculty> getAllFacultys(){
        return facultyService.getFacultys();
    }
}
