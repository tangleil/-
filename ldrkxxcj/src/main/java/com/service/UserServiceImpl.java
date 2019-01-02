package com.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.dao.UserMapper;
import com.domain.User;

@Repository
@Service("UserService")
public class UserServiceImpl implements UserService {
	@Resource(name = "userMapper")
	UserMapper userMapper;

	public User getAllUser() {
		// TODO Auto-generated method stub
		User user = userMapper.selectByPrimaryKey(1);
		System.out.println("间断点");
		System.out.println(user.getUserId() + "/t" + user.getUserName() + "/t" + user.getUserPassword());
		return user;
	}

}
