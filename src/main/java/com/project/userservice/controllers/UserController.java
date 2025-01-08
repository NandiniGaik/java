package com.project.userservice.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.project.userservice.bean.UserBean;
import com.project.userservice.service.UserService;

@RestController
public class UserController {

	@Autowired
	private UserService userService;
	
	@PostMapping("/user/addUser")
	public ResponseEntity<String> createUser(@RequestBody UserBean user){
		String msg=userService.saveUser(user);
		return ResponseEntity.ok(msg);
	}
	
	@GetMapping("/user/getUser/{userId}")
	public ResponseEntity<UserBean> getSingleUser(@PathVariable String userId){
		UserBean user1=userService.getUser(userId);
		return ResponseEntity.ok(user1);
	}
	
	@GetMapping("/user/getAllUsers")
	public ResponseEntity<List<UserBean>> getAllUsers(){
		List<UserBean> alluser=userService.getAllUser();
		return ResponseEntity.ok(alluser);
	}
	
	@DeleteMapping("/user/deleteUser/{userId}")
	public ResponseEntity<String> deleteUser(@PathVariable String userId){
		String msg=userService.deleteUser(userId);
		return ResponseEntity.ok(msg);
	}
//	@PutMapping("/user/update/{userId}")
//	public ResponseEntity<String> updateUser(@PathVariable String userId,@RequestBody UserBean user){
//		Integer c=userService.updateUser(userId, user);
//		String msg=Integer.toString(c)+"data updated";
//		return ResponseEntity.ok(msg);
//	}
}
