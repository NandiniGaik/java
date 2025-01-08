package com.project.userservice.bean;

public class RatingBean {
private String ratingId;
private String userId;
private String hotelId;
private int rating;
private String feedback;
private HotelBean hotel;
public RatingBean() {
	
}
public RatingBean(String ratingId, String userId, String hotelId, int rating, String feedback, HotelBean hotel) {
	super();
	this.ratingId = ratingId;
	this.userId = userId;
	this.hotelId = hotelId;
	this.rating = rating;
	this.feedback = feedback;
	this.hotel = hotel;
}
public HotelBean getHotel() {
	return hotel;
}
public void setHotel(HotelBean hotel) {
	this.hotel = hotel;
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
@Override
public String toString() {
	return "RatingBean [ratingId=" + ratingId + ", userId=" + userId + ", hotelId=" + hotelId + ", rating=" + rating
			+ ", feedback=" + feedback + "]";
}

}
