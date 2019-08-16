package com.bharat.db.oauth.repo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.bharat.db.oauth.model.Data;

 
@Repository
public interface DataRepository extends CrudRepository<Data, Long> {
	Data findByTitle(String title);
}