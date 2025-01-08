package com.project.userservice.entity;

import com.project.userservice.bean.HotelBean;

public class RatingEntity {
	@Override
	public String toString() {
		return "RatingEntity [ratingId=" + ratingId + ", userId=" + userId + ", hotelId=" + hotelId + ", rating="
				+ rating + ", feedback=" + feedback + ", hotelEntity=" + hotelEntity + "]";
	}
	private String ratingId;
	private String userId;
	private String hotelId;
	private int rating;
	private String feedback;
	private HotelEntity hotelEntity;
	public RatingEntity(String ratingId, String userId, String hotelId, int rating, String feedback,
			HotelEntity hotelEntity) {
		super();
		this.ratingId = ratingId;
		this.userId = userId;
		this.hotelId = hotelId;
		this.rating = rating;
		this.feedback = feedback;
		this.hotelEntity = hotelEntity;
	}
	public HotelEntity getHotelEntity() {
		return hotelEntity;
	}
	public void setHotelEntity(HotelEntity hotelEntity) {
		this.hotelEntity = hotelEntity;
	}
	

	public String getRatingId() {
		return ratingId;
	}
	public void setRatingId(String ratingId) {
		this.ratingId = ratingId;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getHotelId() {
		return hotelId;
	}
	public void setHotelId(String hotelId) {
		this.hotelId = hotelId;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	public String getFeedback() {
		return feedback;
	}
	public void setFeedback(String feedback) {
		this.feedback = feedback;
	}
	
	
}
