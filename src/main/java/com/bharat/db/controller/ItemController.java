package com.bharat.db.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bharat.db.model.demo.Item;
import com.bharat.db.repo.demo.ItemRepository;

@RestController
@RequestMapping("/api")
public class ItemController {

	@Autowired
	ItemRepository repository;

	@GetMapping("/items")
	public List<Item> getAllItems() {
		List<Item> items = new ArrayList<>();
		repository.findAll().forEach(items::add);
		System.out.println("count : " + repository.count());
		return items;
	}

	@GetMapping("/items/{name}")
	public Item getItems(@PathVariable String name) {
		System.out.println("ItemController.getItems()" + name);
		return repository.findByName(name);
	}
}