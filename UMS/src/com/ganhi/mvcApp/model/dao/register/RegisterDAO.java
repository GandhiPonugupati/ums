package com.ganhi.mvcApp.model.dao.register;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ganhi.mvcApp.dto.register.RegisterDTO;

@Repository
public class RegisterDAO 
{
	@Autowired
	private SessionFactory factory;
	
	public RegisterDAO() 
	{
		System.out.println(this.getClass().getSimpleName()+" created");
	}

	public void save(RegisterDTO dto)
	{
		System.out.println("save dao started");
		Session session=factory.openSession();
		try{
			Transaction tx=session.beginTransaction();
			session.save(dto);
			tx.commit();
			System.out.println("save dao ended");
		}
		finally{
			System.out.println("closing session");
			session.close();
		}
	}
}
