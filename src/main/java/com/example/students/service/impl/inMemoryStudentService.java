package com.example.students.service.impl;

import com.example.students.model.Student;
import com.example.students.service.StudentService;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class inMemoryStudentService implements StudentService {

    @Override
    public List<Student> findAllStudents() {
        return List.of(
                Student.builder()
                        .firstName("John")
                        .lastName("Doe")
                        .dateOfBirth(LocalDate.of(2000, 1, 1))
                        .email("john.doe@example.com")
                        .age(24)
                        .build(),
                Student.builder()
                        .firstName("Jane")
                        .lastName("Smith")
                        .dateOfBirth(LocalDate.of(1998, 5, 15))
                        .email("jane.smith@example.com")
                        .age(26)
                        .build()
        );
    }
}
