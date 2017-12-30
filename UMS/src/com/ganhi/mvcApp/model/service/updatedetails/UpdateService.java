package com.ganhi.mvcApp.model.service.updatedetails;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ganhi.mvcApp.dto.register.RegisterDTO;
import com.ganhi.mvcApp.model.dao.updatedetails.UpdateDAO;

@Service
public class UpdateService 
{
	@Autowired
	private UpdateDAO dao;
	
	public UpdateService() 
	{
		System.out.println(this.getClass().getSimpleName()+" created");
	}
	
	public RegisterDTO updateDetailsService(RegisterDTO udto)
	{
		System.out.println("updateDetailsService is started");
	RegisterDTO dtoFromDb=dao.updateDetailsDao(udto);
		System.out.println("updateDetailsService is ended");
		return dtoFromDb;
	}

}
