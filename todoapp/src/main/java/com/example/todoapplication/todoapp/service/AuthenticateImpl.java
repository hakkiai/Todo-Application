package com.example.todoapplication.todoapp.service;

import org.springframework.stereotype.Service;

@Service
public class AuthenticateImpl implements Authenticate {
	@Override
	public boolean check(String name,String password)
	{
		boolean isvalidname=name.equalsIgnoreCase("chaitu");
		boolean isvalidpassword=password.equalsIgnoreCase("chaitu");	
		return isvalidname && isvalidpassword;
	}
}
