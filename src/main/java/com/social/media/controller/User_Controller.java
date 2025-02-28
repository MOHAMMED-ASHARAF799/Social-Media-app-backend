package com.social.media.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.social.media.entity.User_details;
import com.social.media.service.User_Service;

@RestController
@CrossOrigin("*")
public class User_Controller {
	@Autowired
	User_Service useServ;
	
	
	@PostMapping("/social/media/add")
	public String addNewUser(@RequestBody User_details data) {
		return useServ.createNewUser(data);
		
	}
	

}
