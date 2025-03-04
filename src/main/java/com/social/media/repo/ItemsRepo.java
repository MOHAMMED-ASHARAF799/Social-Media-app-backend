package com.social.media.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.social.media.entity.ItemsNames;

public interface ItemsRepo extends JpaRepository<ItemsNames, String> {

	public List<ItemsNames> findByCategory(String category);}
	