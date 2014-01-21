package com.zhaoqj.entity;

import java.util.Date;

import javax.annotation.security.RolesAllowed;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class User {
	
	private String userName;
	
	private String password;
	
	private Date brithday;
	
	private String roleName;

	
	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}
	
	@RolesAllowed({"manager", "user"})
	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	@RolesAllowed("user")
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@RolesAllowed("manager")
	public Date getBrithday() {
		return brithday;
	}

	public void setBrithday(Date time) {
		// TODO Auto-generated method stub
		this.brithday = time;
	}
	

}
