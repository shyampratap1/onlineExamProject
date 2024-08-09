package com.online.exam.userrepository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.online.exam.model.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {
    Student findByUsername(String username);
}
