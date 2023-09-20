package com.project.clone.model;


import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;

import lombok.Data;

@Entity
@Data
public class Question {
	@Id
	private int id;
	private String title;
	private String body;
	@ManyToMany(mappedBy = "questions", cascade = CascadeType.ALL)
	private List<Tag> tag;
	@ManyToOne
	private Userr user;
	
	
	public List<Tag> getTag() {
		return tag;
	}
	public void setTag(List<Tag> tag) {
		this.tag = tag;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
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
	public Userr getUser() {
		return user;
	}
	public void setUser(Userr user) {
		this.user = user;
	}
}
