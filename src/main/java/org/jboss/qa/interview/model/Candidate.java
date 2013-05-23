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
 * Entity implementation class for Entity: Candidate
 * 
 */
@Entity
public class Candidate implements Serializable {

	@Id
	@GeneratedValue
	private int id;
	@NotEmpty
	private String name;
	@NotEmpty
	private String login;
	@NotEmpty
	private String password;
	@OneToMany
	private List<Quizz> quizzes = new ArrayList<>();
	private static final long serialVersionUID = 1L;

	public Candidate() {
		super();
	}

	public int getId() {
		return this.id;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Quizz> getQuizzes() {
		return this.quizzes;
	}

	public void setQuizzes(List<Quizz> quizzes) {
		this.quizzes = quizzes;
	}

}
