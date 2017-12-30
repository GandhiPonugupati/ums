package com.ganhi.mvcApp.model.dao.forgotPassword;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
@Repository
public class ForgotDAO
{
	@Autowired
	private SessionFactory factory;

	public ForgotDAO() 
	{
		System.out.println(this.getClass().getSimpleName()+"created");
	}

	public String fetchPassword(String userid){
		System.out.println("fetching is started");
		String hql="select R.email from RegisterDTO R where R.userid=:uid";
		Session session=factory.openSession();
		System.out.println("opening session");
		Query query=session.createQuery(hql);
		System.out.println("creating query");
		query.setParameter("uid", userid);
		System.out.println("setting parameter");
		String email=(String)query.uniqueResult();
		System.out.println("email is "+email);
		return email;
	}

	public int resetPwdByemailId(String email,String password)
	{
		System.out.println("reset password dao is started");
		String hql1="update RegisterDTO R set R.password=:pwd ,R.cpassword=:pwd where R.email=:em";
		Session session=	factory.openSession();
		System.out.println("opening session");
		try{
			Transaction tx=session.beginTransaction();
			System.out.println("begning transaction");
			Query qry=session.createQuery(hql1);

			qry.setParameter("pwd", password);
			System.out.println("setting password parameter ");
			qry.setParameter("em", email);
			System.out.println("setting email parameter");
			System.out.println("email is "+email);
			int res=qry.executeUpdate();
			System.out.println("executing update");
			tx.commit();
			System.out.println("no of records effected......."+res);
			return res;
		}finally{
			session.close();
		}
	}
}