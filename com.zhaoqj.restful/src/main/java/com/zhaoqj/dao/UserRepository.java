package com.zhaoqj.dao;

import java.util.ArrayList;
import java.util.Calendar;

import com.zhaoqj.entity.User;


public class UserRepository implements IUserRepository {

	ArrayList<User> result = new ArrayList<User>();
	
	
	public UserRepository() {
		super();
		User us1= new User();
		us1.setUserName("Jack");
		
		Calendar time =  Calendar.getInstance();
		
		us1.setBrithday(time.getTime());
		
		us1.setPassword("zhaoqj@1");
		
		us1.setRoleName("manager");
		
		User us2= new User();
		us2.setUserName("zhao");

		us2.setBrithday(time.getTime());
		
		us2.setPassword("zhaoqj@1");
		
		us2.setRoleName("user");
		
		result.add(us1);
		result.add(us2);
		
		
	}


	/* (non-Javadoc)
	 * @see com.zhaoqj.dao.IUserRepository#getUserlist()
	 */
	@Override
	public ArrayList<User> getUserlist(){
		
		return result;
	}
	
	public String getUserRole(String userName)
	{
		System.out.println(userName);
		for(User item:this.result)
		{
			if (item.getUserName().equals(userName))
			{
				return item.getRoleName();
			}
		}
		
		return null;
	}
	
	
	
	
}
