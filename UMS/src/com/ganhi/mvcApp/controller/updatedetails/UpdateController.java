package com.ganhi.mvcApp.controller.updatedetails;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.ganhi.mvcApp.dto.register.RegisterDTO;
import com.ganhi.mvcApp.model.service.updatedetails.UpdateService;

@Controller
@RequestMapping("/")
public class UpdateController 
{
	@Autowired
	private UpdateService service;
	
	public UpdateController() 
	{
		System.out.println(this.getClass().getSimpleName()+" created");
	}
	@RequestMapping(value="updatedetails.do" ,method=RequestMethod.POST)
	public ModelAndView updateDetailsController(RegisterDTO udto,HttpServletRequest req)
	{
		System.out.println("updateDetailsController is started");
		HttpSession session=req.getSession(false);
		RegisterDTO dtoFromSession=(RegisterDTO) session.getAttribute("dto");
		
		int id=dtoFromSession.getId();
		udto.setId(id);
		
		RegisterDTO dtoFromDb=service.updateDetailsService(udto);
		//ModelAndView modelAndView=new ModelAndView("/Home.jsp");
	//	modelAndView.addObject("Your details are updated","msg" +udto.getUsername());
		System.out.println("update details controller is ended");
		return  new ModelAndView("UsersHome.jsp" ) ;
	}
}
