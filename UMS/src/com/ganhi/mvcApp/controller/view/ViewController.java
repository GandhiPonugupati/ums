package com.ganhi.mvcApp.controller.view;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.ganhi.mvcApp.model.service.view.ViewService;

@Controller
@RequestMapping("/")
public class ViewController
{
	@Autowired
	private ViewService service;
	
	public ViewController()
	{
		System.out.println(this.getClass().getSimpleName()+" created");
	}
	
	@RequestMapping(value="view.do" ,method=RequestMethod.POST)
	public ModelAndView viewcontroller()
	{
		System.out.println("view controller is started");
		service.viewservice();
		System.out.println("view controller is started");
		return new ModelAndView("View.jsp");
	}
	

}
