package com.ganhi.mvcApp.model.dao.view;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ganhi.mvcApp.dto.register.RegisterDTO;

@Repository
public class ViewDAO 
{
	@Autowired
	private SessionFactory factory;
	
public ViewDAO()
{
	System.out.println(this.getClass().getSimpleName()+" created");
}
	
public List<RegisterDTO> getRegisterTable() 
{	
	String hql="select p from RegisterDTO p";
	Session session=factory.openSession();
	try{
		Query query=session.createQuery(hql);
		List<RegisterDTO> list=query.list();
		return list;
	}finally{
		session.close();
	}
}
	
}
