package com.txsk.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.omg.CORBA.Request;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.txsk.dao.UserMapper;
import com.txsk.model.User;
import com.txsk.service.UserService;

@Service("userService")
public class UserServiceImpl implements UserService {
	
	
   //@Resource(name="userDao")
	@Autowired(required = false)
	private UserMapper userDao;
  
	@Override
	public User selectByPrimaryKey(int id) {
		
		return this.userDao.selectByPrimaryKey(id);
	}

	@Override
	public List<User> selectAll() {
		
		return this.userDao.selectAll();
	}

	@Override
	public int deleteByPrimaryKey(int id) {
		
		return this.userDao.deleteByPrimaryKey(id);
	}

	@Override
	public int updateByPrimaryKey(User user) {
		
		return this.userDao.updateByPrimaryKey(user);
	}

	@Override
	public int insertSelective(User user) {
		
		return this.userDao.insertSelective(user);
	}

	@Override
	public int insert(User user) {
		// TODO Auto-generated method stub
		return this.userDao.insert(user);
	}

	

}
