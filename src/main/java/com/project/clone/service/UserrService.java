package com.project.clone.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.clone.dao.UserrDao;
import com.project.clone.model.Userr;

@Service
public class UserrService {

	@Autowired
	UserrDao userrDao;
	public String addUser(Userr user) {
		userrDao.save(user);
		return "Added";
	}
}
