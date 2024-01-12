package com.example.todoapplication.todoapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.todoapplication.todoapp.entity.Todo;
import com.example.todoapplication.todoapp.repository.todoRepository;

@Service

public class todoServiceImpl implements todoService {
	
	@Autowired
	private todoRepository todorepository;

	@Override
	public Todo saveTodo(Todo todo) {
		// TODO Auto-generated method stub
		return todorepository.save(todo);
	}
	
	@Override
	public List<Todo> fetchTodoList()
	{
		return todorepository.findAll();
	}

	@Override
	public void saveonetodo(String username, String description, String targetdate) {
		// TODO Auto-generated method stub
		Todo todos=new Todo(4,username,description,targetdate,false);
		todorepository.save(todos);
		
	}

}
