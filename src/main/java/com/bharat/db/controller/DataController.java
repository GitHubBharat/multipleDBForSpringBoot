package com.bharat.db.controller;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bharat.db.model.oauth.Data;
import com.bharat.db.repo.oauth.DataRepository;

@RestController
@RequestMapping("/api")
public class DataController {

	@Autowired
	DataRepository repository;

	@GetMapping("/datas/{title}")
	public Data getDateById(@PathVariable String title) {
		System.out.println("DataController.getDateById()" + title);
		return repository.findByTitle(title);
	}
	
	@GetMapping("/datas")
	public List<Data> getAllItems() {
		List<Data> datas = new ArrayList<>();
		repository.findAll().forEach(datas::add);
		System.out.println("count : " + repository.count());
		return datas;
	}

}
 