package com.example.todoapplication.todoapp.service;

import java.util.List;

import com.example.todoapplication.todoapp.entity.Todo;

public interface todoService {

	Todo saveTodo(Todo todo);

	public List<Todo> fetchTodoList();

	public void saveonetodo(String username, String description, String targetdate);
	
		
	
}
