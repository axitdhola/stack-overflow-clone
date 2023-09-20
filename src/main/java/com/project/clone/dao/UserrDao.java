package com.project.clone.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.clone.model.Userr;

@Repository
public interface UserrDao extends JpaRepository<Userr, String> {

}
