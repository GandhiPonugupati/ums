package com.ganhi.mvcApp.model.service.login;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ganhi.mvcApp.dto.login.LoginDTO;
import com.ganhi.mvcApp.dto.register.RegisterDTO;
import com.ganhi.mvcApp.model.dao.login.LoginDAO;
@Service
public class LoginService
{
	@Autowired
	private LoginDAO dao;

	public LoginService() 
	{
		System.out.println(this.getClass().getSimpleName()+"created");
	}
	
	public RegisterDTO vaildateService(LoginDTO dto)
	{
		System.out.println("login service started");
		RegisterDTO dtoFromDb=dao.fetchUser(dto);
		System.out.println("login service ended");
		return dtoFromDb;

	}
}
