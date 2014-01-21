package com.zhaoqj.service;

import java.util.ArrayList;

import com.zhaoqj.entity.User;

public interface IUserService {

	public abstract ArrayList<User> findAll();
	public abstract Boolean checkUserRole(String userName,String role);

}