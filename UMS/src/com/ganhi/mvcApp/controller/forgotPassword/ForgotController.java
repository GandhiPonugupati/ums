	package com.ganhi.mvcApp.controller.forgotPassword;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.ganhi.mvcApp.model.service.forgotPassword.ForgotService;
@Controller
@RequestMapping("/")
public class ForgotController 
{
	@Autowired
	private ForgotService service;

	public ForgotController()
	{
		System.out.println(this.getClass().getSimpleName()+"created");
	}

	@RequestMapping(value="checkuid.do",method=RequestMethod.POST)
	public ModelAndView forgotContoller(@RequestParam String userid){
		System.out.println("forgot controller started");
		String email=service.forgotservice(userid);
		if(email!=null){
			//call another controller which resets the password and forward email
			System.out.println("vaild  user...");
			return new ModelAndView("redirect:reset.do?em="+email);
		}else{
			System.out.println("Invalid UserId" );
			return new ModelAndView("Forgot.jsp","msg","User not exits or invalid user");
		}
	}
	@RequestMapping(value="reset.do",method=RequestMethod.GET)
	public ModelAndView resetpwdController(HttpServletRequest req)
	{
		String email=req.getParameter("em");
		System.out.println("email id is "+email);
		String pwd=service.resetPwdService(email);
		if (pwd!=null) {
			System.out.println("reset success");
			String message ="Reset password Success: Latest pwd:"+pwd;
			return new ModelAndView("Forgot.jsp","msg",message);
		}
		return null;

	}


}
