package com.project.clone.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.clone.model.Answer;
import com.project.clone.service.AnswerService;

@RestController
@RequestMapping("answer")
public class AnswerController {
	@Autowired
	AnswerService answerService;
	
	@PostMapping("add")
	public String addAnswer(@RequestBody Answer answer) {
		return answerService.addAnser(answer);
	}
	
	@GetMapping("question/{id}")
	public List<Answer> getAnswerByQuestion(@PathVariable int id) {
		return answerService.getAnswerByQuestion(id);
	}
	
	@GetMapping("user/{name}")
	public List<Answer> getAnswerByUser(@PathVariable String name) {
		return answerService.getAnswerByUser(name);
	}
}
