package com.zhaoqj.dao;

import java.util.ArrayList;

import com.zhaoqj.entity.User;

public interface IUserRepository {

	public abstract ArrayList<User> getUserlist();
	public abstract String getUserRole(String userName);

}