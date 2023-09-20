package com.project.clone.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.clone.dao.AnswerDao;

import com.project.clone.dao.QuestionDao;

import com.project.clone.dao.UserrDao;
import com.project.clone.model.Answer;

import com.project.clone.model.Question;

import com.project.clone.model.Userr;

@Service
public class AnswerService {

	@Autowired
	AnswerDao answerDao;
	
	@Autowired
	UserrDao userrDao;
	
	@Autowired
	QuestionDao questionDao;
	
	public String addAnser(Answer answer) {
		answerDao.save(answer);
		return "Added";
	}

	public List<Answer> getAnswerByUser(String name) {
		Userr u1 = userrDao.findById(name).get();
		return answerDao.findByUser(u1);
	}

	public List<Answer> getAnswerByQuestion(int id) {
		Question q1 = questionDao.findById(id).get();
		return answerDao.findByQuestion(q1);
	}
}
