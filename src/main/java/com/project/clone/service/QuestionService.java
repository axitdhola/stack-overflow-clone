package com.project.clone.service;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.clone.dao.QuestionDao;
import com.project.clone.dao.TagDao;
import com.project.clone.dao.UserrDao;

import com.project.clone.model.Question;
import com.project.clone.model.Tag;
import com.project.clone.model.Userr;

@Service
public class QuestionService {

	@Autowired
	QuestionDao questionDao;
	@Autowired
	UserrDao userrDao;
	@Autowired
	TagDao tagDao;
	
	public String addQuestion(Question question) {
		questionDao.save(question);
		return "Added";
	}

	public String editQuestion(int id,Question question) {
		Question updatedQuestion = questionDao.findById(id).get();
		updatedQuestion.setBody(question.getBody());
		updatedQuestion.setTag(question.getTag());
		updatedQuestion.setTitle(question.getTitle());
		questionDao.save(updatedQuestion);
		return "Updated";
	}

	public List<Question> getQuestionByTag(List<Tag> tag) {
		return questionDao.findByTagIn(tag);
	}

	public Question getQuestionById(int id) {
		return questionDao.findById(id).get();
	}

	public List<Question> getQuestionByUser(String name) {
		Userr u1 = userrDao.findById(name).get();
		return questionDao.findByUser(u1);
	}
}
