package com.project.clone.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.clone.model.Question;
import com.project.clone.model.Tag;
import com.project.clone.service.QuestionService;

@RestController
@RequestMapping("question")
public class QuestionController {
	@Autowired
	QuestionService questionService;
	
	@PostMapping("add")
	public String addQuestion(@RequestBody Question question) {
		return questionService.addQuestion(question);
	}
	
	@PutMapping("edit/{id}")
	public String editQuestion(@PathVariable int id,@RequestBody Question question) {
		return questionService.editQuestion(id,question);
	}
	
	@PostMapping("tag")
	public List<Question> getQuestionByTag(@RequestBody List<Tag> tag) {
		return questionService.getQuestionByTag(tag);
	}
	
	@GetMapping("user/{name}")
	public List<Question> getQuestionByUser(@PathVariable String name) {
		return questionService.getQuestionByUser(name);
	}
	
	@GetMapping("/{id}")
	public Question getQuestionById(@PathVariable int id) {
		return questionService.getQuestionById(id);
	}
}
