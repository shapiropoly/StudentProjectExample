package com.example.students.controller;

import com.example.students.model.Student;
import com.example.students.service.StudentService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/api/v1/students")
@AllArgsConstructor
public class StudentController {

    private final StudentService service;

    @GetMapping
    public List<Student> findAllStudents() {

        // TODO
        return service.findAllStudents();
    }

    @PostMapping("save_student")
    public String saveStudent(@RequestBody Student student) {
        service.saveStudent(student);
        return "Студент успешно сохранен";
    }

    @GetMapping("/{email}")
    public Student findByEmail(@PathVariable String email) {
        return service.findByEmail(email);
    }

    @PutMapping("update_student")
    public Student updateStudent(@RequestBody Student student) {
        return service.updateStudent(student);
    }

    @DeleteMapping("delete_student/{email}")
    public void deleteStudent(@PathVariable String email) {
        service.deleteStudent(email);
    }
}
