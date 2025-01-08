package com.project.userservice.entity;

public class HotelEntity {
	private String hotelId;
	private String hotelName;
	private String location;
	private String about;
	
	@Override
	public String toString() {
		return "HotelEntity [hotelId=" + hotelId + ", hotelName=" + hotelName + ", location=" + location + ", about="
				+ about + "]";
	}
	public String getHotelId() {
		return hotelId;
	}
	public void setHotelId(String hotelId) {
		this.hotelId = hotelId;
	}
	public String getHotelName() {
		return hotelName;
	}
	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getAbout() {
		return about;
	}
	public void setAbout(String about) {
		this.about = about;
	}
	public HotelEntity(String hotelId, String hotelName, String location, String about) {
		super();
		this.hotelId = hotelId;
		this.hotelName = hotelName;
		this.location = location;
		this.about = about;
	}
}
