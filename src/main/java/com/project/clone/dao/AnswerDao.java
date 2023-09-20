package com.project.clone.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.clone.model.Answer;
import com.project.clone.model.Question;
import com.project.clone.model.Userr;

import java.util.List;


@Repository
public interface AnswerDao extends JpaRepository<Answer, Integer> {
	List<Answer> findByUser(Userr user);
	List<Answer> findByQuestion(Question question);
}
