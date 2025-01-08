package com.project.userservice.service;

import java.util.List;

import com.project.userservice.bean.UserBean;
import com.project.userservice.entity.UserEntity;

public interface UserService {
	String saveUser(UserBean user);
	
	List<UserBean> getAllUser();
	
	UserBean getUser(String userId);
	
	String deleteUser(String userId);
	
	//int updateUser(String userid,UserBean user);
	

}
