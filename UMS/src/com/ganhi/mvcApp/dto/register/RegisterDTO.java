package com.ganhi.mvcApp.dto.register;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
@Entity
@Table(name="register_table")
public class RegisterDTO implements Serializable 
{
	@Id
	@GenericGenerator(name="myid",strategy="increment")
	@GeneratedValue(generator="myid")
	@Column(name="Id")
	private int id;
	@Column(name="Username")
	private String username;
	@Column(name="Email")
	private String email;
	@Column(name="Userid")
	private String userid;
	@Column(name="Password")
	private String password;
	@Column(name="Cpassword")
	private String cpassword;
	@Column(name="Mobileno")
	private long mobileno;
	@Column(name="Question")
	private String question;
	@Column(name="Answer")
	private String answer;
	
	@Column(name="AccountType")
	private String accountType;
	
	public RegisterDTO() 
	{
		System.out.println(this.getClass().getSimpleName()+"Created");
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getCpassword() {
		return cpassword;
	}

	public void setCpassword(String cpassword) {
		this.cpassword = cpassword;
	}

	public long getMobileno() {
		return mobileno;
	}

	public void setMobileno(long mobileno) {
		this.mobileno = mobileno;
	}

	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}

		public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}
	
	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	@Override
	public String toString() {
		return "RegisterDTO [id=" + id + ", username=" + username + ", email="
				+ email + ", userid=" + userid + ", password=" + password
				+ ", cpassword=" + cpassword + ", mobileno=" + mobileno
				+ ", question=" + question + ", answer=" + answer
				+ ", accountType=" + accountType + "]";
	}
	}
