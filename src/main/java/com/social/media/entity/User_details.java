package com.social.media.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class User_details {
	
	@Id
	String fullname;
	String email;
	String  mobile;
	String password;
	public User_details() {
		super();
		// TODO Auto-generated constructor stub
	}
	public User_details(String fullname, String email, String mobile, String password) {
		super();
		this.fullname = fullname;
		this.email = email;
		this.mobile = mobile;
		this.password = password;
	}
	public String getFullname() {
		return fullname;
	}
	public void setFullname(String fullname) {
		this.fullname = fullname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "User_details [fullname=" + fullname + ", email=" + email + ", mobile=" + mobile + ", password="
				+ password + "]";
	}
	
	
	
	}
