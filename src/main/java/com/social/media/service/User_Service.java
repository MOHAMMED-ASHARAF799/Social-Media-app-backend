package com.social.media.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.social.media.entity.User_details;
import com.social.media.repo.User_Repo;

@Service
public class User_Service {
	
	@Autowired
	User_Repo db;
	public String createNewUser(User_details data) {
		String res ="";
		try {
			db.save(data);
			res = "successfully added new user--->" + data.getEmail();
		} catch (Exception e) {
			res = "error while inserting" + " in to db--->" + data.getEmail();
			
		}
		return res;
		
	}
	public String createNewUser1(User_details data) {
		// TODO Auto-generated method stub
		return null;
	}
	

}
