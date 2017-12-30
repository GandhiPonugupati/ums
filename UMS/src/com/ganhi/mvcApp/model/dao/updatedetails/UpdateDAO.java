package com.ganhi.mvcApp.model.dao.updatedetails;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ganhi.mvcApp.dto.register.RegisterDTO;

@Repository
public class UpdateDAO
{
	@Autowired
	private SessionFactory factory;

	public UpdateDAO() 
	{
		System.out.println(this.getClass().getSimpleName()+" created");
	}

	public RegisterDTO updateDetailsDao(RegisterDTO udto)
	{
		System.out.println("update details dao is started");
		Session session=factory.openSession();
		System.out.println("opening session");
		try{
			Transaction tx=session.beginTransaction();
			System.out.println(" transaction started");
			RegisterDTO dtoFromDb=(RegisterDTO) session.merge(udto);
			System.out.println("save or updating the records");
			tx.commit();
			System.out.println(" commiting the data");
			return dtoFromDb;
		}finally{
			System.out.println("session is closed");
			session.close();
		}
	}
}