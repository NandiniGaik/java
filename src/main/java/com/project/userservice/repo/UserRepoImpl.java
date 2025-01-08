package com.project.userservice.repo;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.stream.Collectors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.client.RestTemplate;

import com.project.userservice.bean.HotelBean;
import com.project.userservice.bean.RatingBean;
import com.project.userservice.bean.UserBean;
import com.project.userservice.entity.HotelEntity;
import com.project.userservice.entity.RatingEntity;
import com.project.userservice.entity.UserEntity;
import com.project.userservice.exceptions.ResourceNotFoundException;
import com.project.userservice.external.services.HotelService;
import com.project.userservice.external.services.RatingService;

@Repository
public class UserRepoImpl{

	@Autowired
	private UserRepository userRepository;
	@Autowired
	private RestTemplate restTemplate;
	@Autowired
	private HotelService hotelService;
	@Autowired
	private RatingService ratingService;


	private Logger logger=LoggerFactory.getLogger(UserRepoImpl.class);
	
	public String saveUser(UserBean user) {
		// TODO Auto-generated method stub
		String randId=UUID.randomUUID().toString();
		user.setUserId(randId);
		UserEntity userEntityObject=new UserEntity();
		BeanUtils.copyProperties(user, userEntityObject);
		
		UserEntity un=userRepository.save(userEntityObject);
		return un.getUserId();
		
	}

	
	public List<UserBean> getAllUser() {
		// TODO Auto-generated method stub
		List<UserEntity> un=userRepository.findAll();
		ArrayList<UserBean> listUserBeans=new ArrayList<>();
		un.forEach(x->{
			UserBean userBean=new UserBean();
			BeanUtils.copyProperties(x, userBean);
			listUserBeans.add(userBean);	
		
		});
		return listUserBeans;
		
	}


	public UserBean getUser(String userId) throws ResourceNotFoundException{
		// TODO Auto-generated method stub
		Optional<UserEntity> u=userRepository.findById(userId);
		UserEntity u1=u.get();
		//RatingEntity[] ratingsOfUser=restTemplate.getForObject("http://localhost:8083/users/"+userId, RatingEntity[].class);
		//logger.info("{}",ratingsOfUser);
		
		List<RatingEntity> ratings=ratingService.getRatingsByUserId(userId);
		UserBean ub=new UserBean();
		BeanUtils.copyProperties(u1, ub);

		List<RatingBean> ratingList = ratings.stream()
			    .map(rating -> {
			        //ResponseEntity<HotelEntity> forObject = restTemplate.getForEntity(
			          //  "http://localhost:8082/hotel/getHotel/"+rating.getHotelId(), 
			            //HotelEntity.class
			        //);
			    	logger.info("Fetching hotel details for ID: {}", rating.getHotelId());
			    	logger.info("Ratings fetched for user {}: {}", userId, ratings);

			        HotelEntity hotelEntity = hotelService.getHotel(rating.getHotelId());
			        HotelBean hotelBean=new HotelBean();
			        BeanUtils.copyProperties(hotelEntity, hotelBean);
			        rating.setHotelEntity(hotelEntity);
			        RatingBean rb=new RatingBean();
			        BeanUtils.copyProperties(rating, rb);
			        rb.setHotel(hotelBean);
			        return rb;
			    })
			    .collect(Collectors.toList());
		ub.setRatings(ratingList);
		logger.info("UserEntity after setting ratings: {}", u1);

				logger.info("UserBean to be returned: {}", ub);

		return ub;
	}

	
	
	public String deleteUser(String userId) {
		// TODO Auto-generated method stub
		userRepository.deleteById(userId);
		return "user with id"+userId+"deleted succesfully";
	}


//	public int updateUser(String userid,UserBean user) {
//		// TODO Auto-generated method stub
//		UserEntity en=new UserEntity();
//		BeanUtils.copyProperties(user,en);
//		int c=userRepository.updateUserById(en.getName(), en.getEmail(), en.getAbout(), en.getUserId());
//		return c;
//	}


}
