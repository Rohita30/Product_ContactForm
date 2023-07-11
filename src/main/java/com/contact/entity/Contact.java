package com.contact.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Contact { 
	
	@Id
	@GeneratedValue
	private Long id;
	@Column
	private String name;
	@Column
	private String email;
	@Column
	private String subject;
	@Column
	private String message;
	public Contact(Long id, String name, String email, String subject, String message) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.subject = subject;
		this.message = message;
	}
	public Contact() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	
	
	

}
