package com.sampleapplication.service;

import com.sampleapplication.domain.Student;

import java.util.List;
import java.util.Optional;

public interface StudentService {
    void save(Student student);

    Student getById(long id);

    void delete(long id);

    void update(long id, Student newStudent);

    List<Student> getAllStudent();
}
