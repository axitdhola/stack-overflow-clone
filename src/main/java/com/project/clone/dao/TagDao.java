package com.project.clone.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.clone.model.Tag;

@Repository
public interface TagDao extends JpaRepository<Tag, String> {
   
}
