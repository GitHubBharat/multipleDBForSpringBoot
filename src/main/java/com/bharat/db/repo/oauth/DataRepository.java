package com.bharat.db.repo.oauth;
import org.springframework.data.repository.CrudRepository;

import com.bharat.db.model.oauth.Data;

public interface DataRepository extends CrudRepository<Data, Long> {
	Data findByTitle(String title);
}