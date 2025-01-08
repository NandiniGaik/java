package com.project.userservice.external.services;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.project.userservice.entity.HotelEntity;

@FeignClient(name="HOTEL-SERVICE")
public interface HotelService {
	@GetMapping("/hotel/getHotel/{hotelId}")
	HotelEntity getHotel(@PathVariable String hotelId);
}
