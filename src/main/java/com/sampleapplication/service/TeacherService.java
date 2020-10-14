package com.sampleapplication.service;

import com.sampleapplication.domain.Teacher;

import java.util.List;
import java.util.Optional;

public interface TeacherService {
    void save(Teacher teacher);

    Teacher getById(long id);

    void delete(long id);

    void update(long id, Teacher newTeacher);

    List<Teacher> getAllTeachers();
}
