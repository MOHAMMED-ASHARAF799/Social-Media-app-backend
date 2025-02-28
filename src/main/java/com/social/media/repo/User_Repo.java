package com.social.media.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.social.media.entity.User_details;

public interface User_Repo extends JpaRepository<User_details,String> {

}
