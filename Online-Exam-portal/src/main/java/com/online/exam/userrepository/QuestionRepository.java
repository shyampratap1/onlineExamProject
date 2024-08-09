package com.online.exam.userrepository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.online.exam.model.Exam;
import com.online.exam.model.Question;

public interface QuestionRepository extends JpaRepository<Question, Long> {
	
	   List<Question> findByExam(Exam exam);
}
