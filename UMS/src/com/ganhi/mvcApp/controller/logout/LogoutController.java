package com.ganhi.mvcApp.controller.logout;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.ganhi.mvcApp.controller.login.LoginController;
@Controller
@RequestMapping("/")
public class LogoutController 
{
	public LogoutController() 
	{
		System.out.println(this.getClass().getSimpleName()+" created");
	}
	@RequestMapping(value="logout.do",method=RequestMethod.POST)
	public ModelAndView logoutController(LoginController logincontroller,HttpServletRequest req){
		System.out.println("logout  controller started");
		HttpSession session=req.getSession(false);
		LoginController loginSession=(LoginController) session.getAttribute("logincontroller");
		 session.invalidate();
		System.out.println("logout  controller ended");
		return new ModelAndView("Login.jsp");
	}
}
