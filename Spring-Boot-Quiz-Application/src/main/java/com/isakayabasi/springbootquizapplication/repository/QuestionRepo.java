package com.isakayabasi.springbootquizapplication.repository;


import com.isakayabasi.springbootquizapplication.model.Question;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QuestionRepo extends JpaRepository<Question, Integer> {

}