package com.project.userservice.bean;

import java.util.ArrayList;
import java.util.List;

public class UserBean {

	private String userId;
	private String name;
	private String email;
	private String about;
	private List<RatingBean> ratings=new ArrayList<>();
	
	@Override
	public String toString() {
		return "UserBean [userId=" + userId + ", name=" + name + ", email=" + email + ", about=" + about + ", ratings="
				+ ratings + "]";
	}


	public UserBean() {
		
	}
	
	
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public List<RatingBean> getRatings() {
		return ratings;
	}


	public void setRatings(List<RatingBean> ratings) {
		this.ratings = ratings;
	}


	public String getAbout() {
		return about;
	}
	public void setAbout(String about) {
		this.about = about;
	}	
}
