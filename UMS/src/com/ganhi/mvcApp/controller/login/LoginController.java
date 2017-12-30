package com.ganhi.mvcApp.controller.login;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.ganhi.mvcApp.dto.login.LoginDTO;
import com.ganhi.mvcApp.dto.register.RegisterDTO;
import com.ganhi.mvcApp.model.service.login.LoginService;
@Controller
@RequestMapping("/")
public class LoginController 
{
	@Autowired
	private LoginService service;
	
	public LoginController() 
	{
		System.out.println(this.getClass().getSimpleName()+"creted");
	}
	
	@RequestMapping(value="login.do",method=RequestMethod.POST)
	public ModelAndView loginController(LoginDTO dto,HttpServletRequest req){
		System.out.println("login controller strated...");
		if (dto!=null) {
	RegisterDTO dtoFromDb=service.vaildateService(dto);
	System.out.println(dtoFromDb);
		if(dtoFromDb!=null)
		{
			if(dtoFromDb.getAccountType()=="Admin")
			{
			HttpSession session=req.getSession(true);
			session.setAttribute("dto", dtoFromDb);
			System.out.println("valid  Account....Login Success");
			return new ModelAndView("AdminHome.jsp","name",dtoFromDb.getUsername());
			}else{
				HttpSession session=req.getSession(true);
				session.setAttribute("dto", dtoFromDb);
				System.out.println("valid  Account....Login Success");
				return new ModelAndView("UsersHome.jsp","name",dtoFromDb.getUsername());
			}
		}else
		{
			System.out.println("Userid or password is wrong... ");
			return new ModelAndView("Login.jsp","msg","userid or password is wrong...");
		}
	}
		System.out.println("user login controller ended");
		return null;
	}

}
