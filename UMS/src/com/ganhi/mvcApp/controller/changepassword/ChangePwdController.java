package com.ganhi.mvcApp.controller.changepassword;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.ganhi.mvcApp.dto.changepassword.ChangePwdDTO;
import com.ganhi.mvcApp.dto.register.RegisterDTO;
import com.ganhi.mvcApp.model.service.changepassword.ChangePwdService;
@Controller
@RequestMapping("/")
public class ChangePwdController 
{
	@Autowired
	private ChangePwdService changepwdservice;

	public ChangePwdController()
	{
		System.out.println(this.getClass().getSimpleName()+"created");
	}

	@RequestMapping(value="changepwd.do" ,method=RequestMethod.POST)
	public ModelAndView changePwdController(ChangePwdDTO dto,HttpServletRequest req)
	{
		System.out.println("change password controller strated......");
		System.out.println("dto is "+dto);
		System.out.println("user id "+dto.getUserid());
		System.out.println("old password "+dto.getOldpwd());
		System.out.println("new password is  "+dto.getNewpwd());
		System.out.println("confirm password is "+dto.getCnewpwd());
		HttpSession session=req.getSession(false);
		
		RegisterDTO dtoFromSession= (RegisterDTO) session.getAttribute("dto");
		System.out.println("RDTO--->"+dtoFromSession);
	String message=changepwdservice.changePwdService(dto, dtoFromSession);
		System.out.println("change password controller ended");
		return new ModelAndView("UsersHome.jsp","msg",message);
	}

}
