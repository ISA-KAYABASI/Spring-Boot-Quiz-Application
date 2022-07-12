package com.isakayabasi.springbootquizapplication.repository;


import com.isakayabasi.springbootquizapplication.model.Result;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ResultRepo extends JpaRepository<Result, Integer> {
	
}
