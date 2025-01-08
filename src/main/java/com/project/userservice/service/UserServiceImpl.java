package com.project.userservice.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.project.userservice.bean.HotelBean;
import com.project.userservice.bean.UserBean;
import com.project.userservice.entity.HotelEntity;
import com.project.userservice.entity.RatingEntity;
import com.project.userservice.repo.UserRepoImpl;
@Service
public class UserServiceImpl implements UserService{

	@Autowired
	private UserRepoImpl userRepoImpl;
		

	@Override
	public String saveUser(UserBean user) {
		// TODO Auto-generated method stub
		return userRepoImpl.saveUser(user);
	}

	@Override
	public List<UserBean> getAllUser() {
		// TODO Auto-generated method stub
		return userRepoImpl.getAllUser();
	}

	@Override
	public UserBean getUser(String userId) {
		// TODO Auto-generated method stub
	
				
		UserBean userBean=userRepoImpl.getUser(userId);
		return userBean;
	}

	@Override
	public String deleteUser(String userId) {
		// TODO Auto-generated method stub
		return userRepoImpl.deleteUser(userId);
	}

	//@Override
//	public int updateUser(String userid, UserBean user) {
//		// TODO Auto-generated method stub
//		return userRepoImpl.updateUser(userid, user);
//				
//	}
	
	
	
	

}
