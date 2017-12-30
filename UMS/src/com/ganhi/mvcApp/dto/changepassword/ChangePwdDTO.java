package com.ganhi.mvcApp.dto.changepassword;

import java.io.Serializable;

public class ChangePwdDTO implements Serializable
{
	private String  userid;
	private String oldpwd;
	private String newpwd;
	private String cnewpwd;
	
	public ChangePwdDTO() 
	{
		System.out.println(this.getClass().getSimpleName()+"created");
	}

	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getOldpwd() {
		return oldpwd;
	}

	public void setOldpwd(String oldpwd) {
		this.oldpwd = oldpwd;
	}

	public String getNewpwd() {
		return newpwd;
	}

	public void setNewpwd(String newpwd) {
		this.newpwd = newpwd;
	}

	public String getCnewpwd() {
		return cnewpwd;
	}

	public void setCnewpwd(String cnewpwd) {
		this.cnewpwd = cnewpwd;
	}

	@Override
	public String toString() {
		return "ChangePwdDTO [userid=" + userid + ", oldpwd=" + oldpwd
				+ ", newpwd=" + newpwd + ", cnewpwd=" + cnewpwd + "]";
	}
	

}
