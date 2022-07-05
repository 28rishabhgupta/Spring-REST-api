package com.codewithrishabh.blog.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.codewithrishabh.blog.entities.Category;

public interface CategoryRepo extends JpaRepository<Category, Integer> {
	
	
	
}
