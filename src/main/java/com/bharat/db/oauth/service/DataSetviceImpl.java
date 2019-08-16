package com.bharat.db.oauth.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.bharat.db.oauth.model.Data;
import com.bharat.db.oauth.repo.DataRepository;

/**
 * 
 * @author ErBharatp
 *
 */
@Component
public class DataSetviceImpl implements DataService {

	private static final Logger log = LoggerFactory.getLogger(DataSetviceImpl.class);

	private DataRepository dataRepository;

	@Override
	public Data save(Data data) {
		 
		return dataRepository.save(data);
	}

}
