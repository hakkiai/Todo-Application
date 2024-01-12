package com.example.todoapplication.todoapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.todoapplication.todoapp.entity.Todo;

@Repository
public interface todoRepository extends JpaRepository<Todo,Integer>{

}
