package com.project.userservice.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.project.userservice.entity.UserEntity;

import jakarta.transaction.Transactional;

public interface UserRepository extends JpaRepository<UserEntity,String>{
	

//	@Modifying
//    @Transactional
//    @Query("UPDATE User u SET u.name = ?1, u.email = ?2, u.about=?3 WHERE u.id = ?4")
//    int updateUserById(String name, String email, String about,String userid);
}
