package com.social.media.service;



import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.social.media.entity.ItemsNames;

@SpringBootApplication
public class ItemsService {

	public static void main(String[] args) {
		SpringApplication.run(ItemsService.class, args);
	}

	public String deleteItemsNames(String itemsNamesName) {
		// TODO Auto-generated method stub
		return null;
	}

	public String updateItemsNames(ItemsNames itemsNames) {
		// TODO Auto-generated method stub
		return null;
	}

	public ItemsNames getItemsNames(String itemsNamesName) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<ItemsNames> getAllItemsNamessBtCatgory(String category) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<ItemsNames> getAllItemsNamess() {
		// TODO Auto-generated method stub
		return null;
	}

	public String saveAllItemsNamess(List<ItemsNames> itemsNamesList) {
		// TODO Auto-generated method stub
		return null;
	}

	public String saveNewItemsNames(ItemsNames itemsNames) {
		// TODO Auto-generated method stub
		return null;
	}

}