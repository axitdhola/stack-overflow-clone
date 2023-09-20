package com.project.clone.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;


@Entity
public class Answer {
	@Id
	private int id;
	private String body;
	private String status;
	@ManyToOne
	private Question question;
	@ManyToOne
	private Userr user;
	
	
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getBody() {
		return body;
	}
	public void setBody(String body) {
		this.body = body;
	}
	public Question getQuestion() {
		return question;
	}
	public void setQuestion(Question question) {
		this.question = question;
	}
	public Userr getUser() {
		return user;
	}
	public void setUser(Userr user) {
		this.user = user;
	}
}
