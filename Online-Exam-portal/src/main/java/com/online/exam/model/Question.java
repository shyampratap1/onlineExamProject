package com.online.exam.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Question {

	 @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;
	    private String content;
	    private String optionA;
	    private String optionB;
	    private String optionC;
	    private String optionD;
	    private String correctAnswer;
	    
	    public Question(Long id, String content, String optionA, String optionB, String optionC, String optionD,
				String correctAnswer, Exam exam) {
			super();
			this.id = id;
			this.content = content;
			this.optionA = optionA;
			this.optionB = optionB;
			this.optionC = optionC;
			this.optionD = optionD;
			this.correctAnswer = correctAnswer;
			this.exam = exam;
		}


		@ManyToOne
	    @JoinColumn(name = "exam_id")
	    private Exam exam;

	    
	    public Exam getExam() {
			return exam;
		}
		public void setExam(Exam exam) {
			this.exam = exam;
		}
		public Long getId() {
			return id;
		}
		public void setId(Long id) {
			this.id = id;
		}
		public String getContent() {
			return content;
		}
		public void setContent(String content) {
			this.content = content;
		}
		public String getOptionA() {
			return optionA;
		}
		public void setOptionA(String optionA) {
			this.optionA = optionA;
		}
		public String getOptionB() {
			return optionB;
		}
		public void setOptionB(String optionB) {
			this.optionB = optionB;
		}
		public String getOptionC() {
			return optionC;
		}
		public void setOptionC(String optionC) {
			this.optionC = optionC;
		}
		public String getOptionD() {
			return optionD;
		}
		public void setOptionD(String optionD) {
			this.optionD = optionD;
		}
		public String getCorrectAnswer() {
			return correctAnswer;
		}
		public void setCorrectAnswer(String correctAnswer) {
			this.correctAnswer = correctAnswer;
		}
		
		
		public Question() {
			super();
			// TODO Auto-generated constructor stub
		}
}
