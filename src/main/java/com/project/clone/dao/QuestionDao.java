package com.project.clone.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;


import com.project.clone.model.Question;

import com.project.clone.model.Userr;
import com.project.clone.model.Tag;


@Repository
public interface QuestionDao extends JpaRepository<Question, Integer> {
	List<Question> findByUser(Userr user);
	List<Question> findByTagIn(List<Tag> tag);
}