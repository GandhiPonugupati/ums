package com.ganhi.mvcApp.model.dao.login;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ganhi.mvcApp.dto.login.LoginDTO;
import com.ganhi.mvcApp.dto.register.RegisterDTO;
@Repository
public class LoginDAO
{
	@Autowired
	private SessionFactory factory;

	public LoginDAO() 
	{
		System.out.println(this.getClass().getSimpleName()+"created");
	}
	public RegisterDTO fetchUser(LoginDTO dto)
	{
		System.out.println("fetching user started");
		String hql="select R from RegisterDTO R where R.userid=:uid and R.password=:pwd";
		Session session=factory.openSession();
		try{
			Query qry=session.createQuery(hql);
			qry.setParameter("uid", dto.getUserid());
			qry.setParameter("pwd", dto.getPassword());
			RegisterDTO dtoFromDb=(RegisterDTO) qry.uniqueResult();
			System.out.println("fetching user ended");
			return dtoFromDb;
		}finally{
			System.out.println("closing session ");
			session.close();
		}
	}
}