package com.bharat.db.oauth.controller;
import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.bharat.db.oauth.model.Data;
import com.bharat.db.oauth.repo.DataRepository;
import com.bharat.db.oauth.service.DataService;

@RestController
@RequestMapping("/api")
public class DataController {

private static final Logger log = LoggerFactory.getLogger(DataController.class);

	@Autowired
	DataRepository repository;

//	@Autowired(required=true)
//	DataService service;
	@PostMapping(path = "/save")
	public @ResponseBody Data save( Data data) {
		log.info("DataController.save()");
		Data data2= new Data();
		data2.setTitle(data.getTitle());
	 data2.setId(data.getId());
		return repository.save(data);
		
	}
	
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
 