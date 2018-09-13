package com.example.meli.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.meli.model.Question;

@Repository
public interface QuestionRepository extends JpaRepository<Question, Long> {
}