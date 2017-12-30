package com.ganhi.mvcApp.model.service.register;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ganhi.mvcApp.dto.register.RegisterDTO;
import com.ganhi.mvcApp.model.dao.register.RegisterDAO;

@Service
public class RegisterService 
{
	
	public RegisterService() 
	{
		System.out.println(this.getClass().getSimpleName()+"created...");
	}
	
	@Autowired
	private RegisterDAO dao;

	public void registerUserService(RegisterDTO dto){
		System.out.println("register service started");
		dao.save(dto);
		System.out.println("register service ended");
	}
}
