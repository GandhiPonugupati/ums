package com.ganhi.mvcApp.model.service.forgotPassword;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.stereotype.Service;

import com.ganhi.mvcApp.model.dao.forgotPassword.ForgotDAO;
@Service
public class ForgotService 
{
	@Autowired
	private JavaMailSenderImpl sender;

	@Autowired
	private ForgotDAO dao;

	public ForgotService() 
	{
		System.out.println(this.getClass().getSimpleName()+"created");
	}

	public String forgotservice(String userid){
		System.out.println("forgot service started");
		return dao.fetchPassword(userid);
	}
	public String resetPwdService(String email){
		//generate random password
		UUID uid=UUID.randomUUID();
		String randompwd=uid.toString().substring(0, 8);
		System.out.println("randompwd is :"+randompwd);
		int res=dao.resetPwdByemailId(email, randompwd);
		if(res!=0){
			SimpleMailMessage message=new SimpleMailMessage();
			message.setTo("gandhiponugupati@gmail.com");
			message.setFrom("gandhiponugupati@gmail.com");
			message.setSubject("Letest password for UMS");
			message.setText("Hi User ,\n\nLatest Pasword is :"+randompwd);
			sender.send(message);
			return randompwd;
		}
		return null;

	}

}
