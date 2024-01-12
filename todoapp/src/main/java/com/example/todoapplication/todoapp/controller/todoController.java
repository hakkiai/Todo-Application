package com.example.todoapplication.todoapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.example.todoapplication.todoapp.entity.Todo;
import com.example.todoapplication.todoapp.service.todoService;

@Controller
@SessionAttributes({"username","description","targetdate"})
public class todoController {
	
	@Autowired
	private todoService todoservice;
	@ResponseBody
	@PostMapping("/save")
	public Todo saveTodo(@RequestBody Todo todo)
	{
		return todoservice.saveTodo(todo);
	}
	
	
	@RequestMapping("todo-list")
	public String fetchTodoList(ModelMap model)
	{	
		List<Todo> todo=todoservice.fetchTodoList();
		model.put("todos",todo);
		return "list";
	}
	
	
	@GetMapping("add-todo")
	public String showaddtodo(ModelMap model)
	{	
		return "addtodo" ;
	}
	
	
	@PostMapping("add-todo")
	public String showaddtodos(@RequestParam String username,@RequestParam String description,@RequestParam String targetdate,ModelMap model)
	{	
		todoservice.saveonetodo(username,description,targetdate);
//		model.put("username", username);
//		model.put("description", description);
//		model.put("targetdate",targetdate);
		return "redirect:todo-list" ;
	}
	
}
	

	
	
