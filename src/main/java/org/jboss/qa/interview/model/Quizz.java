package org.jboss.qa.interview.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

/**
 * Entity implementation class for Entity: Quizz
 * 
 */
@Entity
public class Quizz implements Serializable {

	@Id
	@GeneratedValue
	private int id;
	@ManyToOne
	private QuizzType quizzType;
	@OneToMany
	private List<Answer> answers;
	@ManyToOne
	private Candidate candidate;
	private long validFrom;
	private long validUntil;
	private boolean done = false;

	public long getValidFrom() {
		return validFrom;
	}

	public void setValidFrom(long validFrom) {
		this.validFrom = validFrom;
	}

	public long getValidUntil() {
		return validUntil;
	}

	public void setValidUntil(long validUntil) {
		this.validUntil = validUntil;
	}

	public boolean isDone() {
		return done;
	}

	public void setDone(boolean done) {
		this.done = done;
	}

	private static final long serialVersionUID = 1L;

	public Quizz() {
		super();
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public QuizzType getQuizzType() {
		return this.quizzType;
	}

	public void setQuizzType(QuizzType quizzType) {
		this.quizzType = quizzType;
	}

	public List<Answer> getAnswers() {
		return this.answers;
	}

	public void setAnswers(List<Answer> answers) {
		this.answers = answers;
	}

	public Candidate getCandidate() {
		return this.candidate;
	}

	public void setCandidate(Candidate candidate) {
		this.candidate = candidate;
	}

}
