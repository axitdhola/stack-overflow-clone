package com.project.clone.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.clone.model.Userr;
import com.project.clone.service.UserrService;

@RestController
@RequestMapping("user")
public class UserrController {
	@Autowired
	UserrService userrService;
	
	@PostMapping("add")
	public String addUser(@RequestBody Userr user) {
		return userrService.addUser(user);
	}
}
