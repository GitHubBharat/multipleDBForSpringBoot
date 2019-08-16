package com.bharat.db.demo.repo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.bharat.db.demo.model.Item;
@Repository
public interface ItemRepository extends CrudRepository<Item, Long> {
	Item findByName(String name);
}