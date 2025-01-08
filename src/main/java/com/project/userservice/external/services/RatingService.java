package com.project.userservice.external.services;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.project.userservice.entity.RatingEntity;

@FeignClient(name="RATINGSERVICE")
public interface RatingService {
	
	@GetMapping("/rating/users/{userId}")
	public List<RatingEntity> getRatingsByUserId(@PathVariable String userId);


}
