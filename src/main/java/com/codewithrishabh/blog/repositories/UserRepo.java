package com.codewithrishabh.blog.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.codewithrishabh.blog.entities.User;

public interface UserRepo extends JpaRepository<User, Integer>
{

	
	
}
