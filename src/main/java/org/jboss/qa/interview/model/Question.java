package org.jboss.qa.interview.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import org.hibernate.validator.constraints.NotEmpty;

/**
 * Entity implementation class for Entity: Question
 *
 */
@Entity
public abstract class Question implements Serializable {

	@GeneratedValue
	@Id
	private int id;
	@NotEmpty
	private String question;
	private long deadline;
	private int score;
	@OneToMany
	private List<Tag> tags = new ArrayList<>();
	private static final long serialVersionUID = 1L;

	public Question() {
		super();
	}   
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}   
	public String getQuestion() {
		return this.question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}   
	public long getDeadline() {
		return this.deadline;
	}

	public void setDeadline(long deadline) {
		this.deadline = deadline;
	}   
	public int getScore() {
		return this.score;
	}

	public void setScore(int score) {
		this.score = score;
	}   
	public List<Tag> getTags() {
		return this.tags;
	}

	public void setTags(List<Tag> tags) {
		this.tags = tags;
	}
   
}
