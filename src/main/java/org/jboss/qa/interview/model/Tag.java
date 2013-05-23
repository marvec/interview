package org.jboss.qa.interview.model;

import java.io.Serializable;
import java.lang.String;
import javax.persistence.*;
import javax.persistence.GeneratedValue;

/**
 * Entity implementation class for Entity: Tag
 *
 */
@Entity

public class Tag implements Serializable {

	
	private String name;   
	@GeneratedValue
	@Id
	private int id;
	private static final long serialVersionUID = 1L;

	public Tag() {
		super();
	}   
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}   
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}
   
}
