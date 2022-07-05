package com.codewithrishabh.blog.services;

import java.util.List;

import com.codewithrishabh.blog.payloads.CategoryDto;

public interface CategoryService {
	//Create
	public CategoryDto createCategory(CategoryDto categoryDto);
	
	
	//Update
	public CategoryDto updateCategory(CategoryDto categoryDto, Integer categoryId);
	
	//Delete
	
	public void deleteCategory(Integer categoryId);
	
	//Get 
	public CategoryDto getCategory( Integer categoryId);
	//GetAll
    List<CategoryDto> getCategories();
}
