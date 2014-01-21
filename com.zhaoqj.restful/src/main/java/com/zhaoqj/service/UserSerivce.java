package com.zhaoqj.service;

import java.util.ArrayList;

import com.zhaoqj.dao.IUserRepository;
import com.zhaoqj.entity.User;

public class UserSerivce implements IUserService {

	private IUserRepository userRep;

	public UserSerivce(IUserRepository userRep) {
		super();
		this.userRep = userRep;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.zhaoqj.service.IUserService#findAll()
	 */
	@Override
	public ArrayList<User> findAll() {

		return userRep.getUserlist();
	}

	public String getUserNameFromAuthication(String baseAuthString) {

		String result = baseAuthString.replace("Basic ", "");

		if (result.split(":").length > 0) {
			return result = result.split(":")[0];
		}

		return null;

	}
	
	public Boolean checkUserRole(String userName,String role){
		
		String userRole= userRep.getUserRole(userName);
		
		if (userRole!= null)
		{
			if (userRole.equals(role))
			{
				return true;
				
			}
			else
			{
				return false;
			}
		}
		
		return false;
		
	}
	

}
