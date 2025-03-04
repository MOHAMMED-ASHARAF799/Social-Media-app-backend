package com.social.media.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.social.media.entity.ItemsNames;
import com.social.media.service.ItemsService;

@RestController
@CrossOrigin("*")
public class ItemsController {

	@Autowired
	ItemsService flSer;
	
	
	@PostMapping("/social/media/bakery/items/add")
	public String addNewItemsNames(@RequestBody ItemsNames ItemsNames) {
		return flSer.saveNewItemsNames(ItemsNames);
	}
	

	@PostMapping("/social/media/bakery/items/add/all")
	public String addAllItemsNamess(@RequestBody List<ItemsNames> ItemsNamesList) {
		return flSer.saveAllItemsNamess(ItemsNamesList);
	}
	
	//http://localhost:8080/ItemsNamess/app/get/all
	
	@GetMapping("/social/media/bakery/items/get/all")
	public List<ItemsNames> getAllItemsNamess() {
		return flSer.getAllItemsNamess();
	}
	
	@GetMapping("/social/media/bakery/items/get/byCategory")
	public List<ItemsNames> getAllItemsNamessByCategory(
			@RequestParam String category) {
		return flSer.getAllItemsNamessBtCatgory(category);
	}
	
	
	//http://localhost:8080/ItemsNamess/app/get/one?ItemsNamesName=XYZ
	@GetMapping("/social/media/bakery/items/get/one")
	public ItemsNames getOneItemsNames(@RequestParam String ItemsNamesName) {
		return flSer.getItemsNames(ItemsNamesName);
	}
	
	//http://localhost:8080/ItemsNamess/app/update/one
	//method--->PUT
	/*
	 * {
    "name": "XYZ",
    "category": "Decorative",
    "imgUrl": "http://jasmine",
    "price": 1200
}
	 * 
	 * 
	 */
	@PutMapping("/social/media/bakery/items/update/one")
	public String updateItemsNames(@RequestBody ItemsNames ItemsNames) {
		return flSer.updateItemsNames(ItemsNames);
	}
	
	//http://localhost:8080/ItemsNamess/app/delete/one?ItemsNamesName=ABC
//method--->DELETE
	
	@DeleteMapping("/social/media/bakery/items/delete/one")
	public String deleteOneItemsNames(@RequestParam String ItemsNamesName) {
		return flSer.deleteItemsNames(ItemsNamesName);
	}
	
	
	
	
	
}