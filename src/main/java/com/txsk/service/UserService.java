package com.txsk.service;

import java.util.List;

import com.txsk.model.User;

public interface UserService {
	public User selectByPrimaryKey(int id);

	public List<User> selectAll();

	public int deleteByPrimaryKey(int id);

	public int updateByPrimaryKey(User user);

	public int insertSelective(User user);
	
	public int insert(User user);
	
	
}
