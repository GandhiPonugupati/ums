package com.ganhi.mvcApp.model.dao.changepassword;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ganhi.mvcApp.dto.changepassword.ChangePwdDTO;

@Repository
public class ChangePwdDAO
{
	@Autowired
	private SessionFactory factory;

	public ChangePwdDAO() 
	{
		System.out.println(this.getClass().getSimpleName()+"created");
	}
	public String  updatePassword(ChangePwdDTO dto) 
	{	
		System.out.println("calling query");
		String hql2="update RegisterDTO R set R.password=:npwd ,R.cpassword=:cpwd where R.userid=:uid";
		System.out.println("query is "+hql2);

		Session session=factory.openSession();
		System.out.println("opening session");
		try{
			Transaction tx=session.beginTransaction();
			System.out.println("begining Transaction");

			Query query=session.createQuery(hql2);
			System.out.println("creating query");

			query.setParameter("npwd",dto.getNewpwd());
			System.out.println("new password is "+dto.getNewpwd());

			query.setParameter("cpwd",dto.getCnewpwd());
			System.out.println("confirm password is "+dto.getCnewpwd());

			query.setParameter("uid", dto.getUserid());
			System.out.println(" old password is "+dto.getOldpwd());

			int res=query.executeUpdate();
			System.out.println("executing the query");

			tx.commit();
			System.out.println("commiting record");
			System.out.println("no of records effected...."+res);

			System.out.println("password is updating ended");
			System.out.println("ruturning query");
			return hql2;

		}finally{
			session.close();
		}
	}
}