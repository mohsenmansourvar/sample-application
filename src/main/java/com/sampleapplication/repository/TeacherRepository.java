package com.sampleapplication.repository;

import com.sampleapplication.domain.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TeacherRepository extends JpaRepository<Teacher, Long> {
}
