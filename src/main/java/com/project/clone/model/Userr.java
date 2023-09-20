package com.project.clone.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Userr {
	@Id
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
