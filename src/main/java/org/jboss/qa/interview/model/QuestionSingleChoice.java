package org.jboss.qa.interview.model;

import java.io.Serializable;
import java.lang.String;
import javax.persistence.*;
import org.jboss.qa.interview.model.Question;

/**
 * Entity implementation class for Entity: QuestionSingleChoice
 *
 */
@Entity
@Inheritance(strategy=InheritanceType.JOINED)
public class QuestionSingleChoice extends Question implements Serializable {
	
	private String[] options;
	private int correctIdx;
	private static final long serialVersionUID = 1L;

	public QuestionSingleChoice() {
		super();
	}   
	public String[] getOptions() {
		return this.options;
	}

	public void setOptions(String[] options) {
		this.options = options;
	}   
	public int getCorrectIdx() {
		return this.correctIdx;
	}

	public void setCorrectIdx(int correctIdx) {
		this.correctIdx = correctIdx;
	}
   
}
