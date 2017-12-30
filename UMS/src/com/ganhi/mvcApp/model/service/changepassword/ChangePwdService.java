package com.ganhi.mvcApp.model.service.changepassword;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ganhi.mvcApp.dto.changepassword.ChangePwdDTO;
import com.ganhi.mvcApp.dto.register.RegisterDTO;
import com.ganhi.mvcApp.model.dao.changepassword.ChangePwdDAO;

@Service
public class ChangePwdService
{
	@Autowired
	private ChangePwdDAO changepwddao;

	public ChangePwdService() 
{
	System.out.println(this.getClass().getSimpleName()+"created");
}
	
 public String changePwdService(ChangePwdDTO dto,RegisterDTO dtoFromSession) 
 {
	 String message=null;
	 System.out.println("Change Password dto ---->"+dto);
	 System.out.println("change password is started"+dtoFromSession);
	
	 if (dtoFromSession.getPassword().equals(dto.getOldpwd()) && dtoFromSession.getUserid().equals(dto.getUserid())) 
	 {
		System.out.println("userid and old password are validated");
		System.out.println("new password is "+dto.getNewpwd());
		System.out.println("old password is "+dto.getCnewpwd());
		//check for latest password correctness
		if (dto.getNewpwd().equals(dto.getCnewpwd()))
		{
			System.out.println("latest passwords are  matching");
			changepwddao.updatePassword(dto);
			message="password changed successfully";
		}else{
			System.out.println("latest password are not matching ");
			message="latest passwords are not matching";
		}
	}else{
		System.out.println("invalid userid or password");
		message="invalid userid or password ";
	}
	 System.out.println("Change password is ended");
	return message;
	 
 }
}
