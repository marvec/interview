package org.jboss.qa.interview.model;

import java.io.Serializable;
import java.util.Map;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Entity implementation class for Entity: QuizzType
 *
 */
@Entity

public class QuizzType implements Serializable {

	@Id
	@GeneratedValue
	private int id;
	
	@ElementCollection
	private Map<Tag,Integer> tagOccurences;
	private long maxScore;
	private long maxTime;
	private int lives;
	private static final long serialVersionUID = 1L;

	public QuizzType() {
		super();
	}   
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}   
	public Map<Tag,Integer> getTagOccurences() {
		return this.tagOccurences;
	}

	public void setTagOccurences(Map<Tag,Integer> tagOccurences) {
		this.tagOccurences = tagOccurences;
	}   
	public long getMaxScore() {
		return this.maxScore;
	}

	public void setMaxScore(long maxScore) {
		this.maxScore = maxScore;
	}   
	public long getMaxTime() {
		return this.maxTime;
	}

	public void setMaxTime(long maxTime) {
		this.maxTime = maxTime;
	}   
	public int getLives() {
		return this.lives;
	}

	public void setLives(int lives) {
		this.lives = lives;
	}
   
}
