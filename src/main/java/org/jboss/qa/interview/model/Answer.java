package org.jboss.qa.interview.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import org.hibernate.validator.constraints.NotEmpty;

/**
 * Entity implementation class for Entity: Answer
 *
 */
@Entity

public class Answer implements Serializable {

	   
	@Id
	@GeneratedValue
	private int id;
	@ManyToOne
	private Question question;
	@NotEmpty
	private String answer;
	private long score;
	private static final long serialVersionUID = 1L;

	public Answer() {
		super();
	}   
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}   
	public Question getQuestion() {
		return this.question;
	}

	public void setQuestion(Question question) {
		this.question = question;
	}   
	public String getAnswer() {
		return this.answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}   
	public long getScore() {
		return this.score;
	}

	public void setScore(long score) {
		this.score = score;
	}
   
}
