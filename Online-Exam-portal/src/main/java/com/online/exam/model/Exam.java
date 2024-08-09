package com.online.exam.model;

import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Exam {
	 @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;
	    private String title;
	    private String description;
	    
	    
	    @OneToMany(mappedBy = "exam", cascade = CascadeType.ALL)
	    private Set<Question> questions;

	    
		public Set<Question> getQuestions() {
			return questions;
		}
		public void setQuestions(Set<Question> questions) {
			this.questions = questions;
		}
		public Long getId() {
			return id;
		}
		public void setId(Long id) {
			this.id = id;
		}
		public String getTitle() {
			return title;
		}
		public void setTitle(String title) {
			this.title = title;
		}
		public String getDescription() {
			return description;
		}
		public void setDescription(String description) {
			this.description = description;
		}
	
		public Exam() {
			super();
			// TODO Auto-generated constructor stub
		}
		public Exam(Long id, String title, String description, Set<Question> questions) {
			super();
			this.id = id;
			this.title = title;
			this.description = description;
			this.questions = questions;
		}

}
