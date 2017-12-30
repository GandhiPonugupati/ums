package com.ganhi.mvcApp.controller.register;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.ganhi.mvcApp.dto.register.RegisterDTO;
import com.ganhi.mvcApp.model.service.register.RegisterService;

@Controller
@RequestMapping("/")
public class RegisterController 
{
	@Autowired
	private RegisterService service;

	public RegisterController() 
	{
		System.out.println(this.getClass().getSimpleName()+"created");
	}

	@RequestMapping(value="registration.do",method=RequestMethod.POST)
	public ModelAndView registerUserController(RegisterDTO dto)
	{
		System.out.println("RegisterUserController method Started..");
		
		service.registerUserService(dto);
		//return new ModelAndView("Login.jsp","msg","Registration success...lgoin!!");

		ModelAndView modelAndView=new ModelAndView("/Login.jsp");
		modelAndView.addObject("SuccessMessage","Your registration Success "+dto.getUsername());
		//modelAndView.addObject("SuccessMessage","Is success," +dto.getUsername());
		System.out.println("Register User eneded");
		return modelAndView;

	}

}
