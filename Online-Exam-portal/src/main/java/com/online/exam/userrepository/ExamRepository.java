package com.online.exam.userrepository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.online.exam.model.Exam;

public interface ExamRepository extends JpaRepository<Exam, Long> {
}
