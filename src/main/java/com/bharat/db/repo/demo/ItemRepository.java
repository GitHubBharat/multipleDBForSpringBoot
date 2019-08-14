package com.bharat.db.repo.demo;
import org.springframework.data.repository.CrudRepository;

import com.bharat.db.model.demo.Item;

public interface ItemRepository extends CrudRepository<Item, Long> {
	Item findByName(String name);
}