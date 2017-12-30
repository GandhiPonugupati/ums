package com.ganhi.mvcApp.model.service.view;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ganhi.mvcApp.model.dao.view.ViewDAO;

@Service
public class ViewService 
{
	@Autowired
	private ViewDAO dao;
	
	public ViewService() 
	{
		System.out.println(this.getClass().getSimpleName()+" created");
	}
	public void viewservice()
	{
		System.out.println("view service is started");
		dao.getRegisterTable();
		System.out.println("view service is ended");
	}
}
