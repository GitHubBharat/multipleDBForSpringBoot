/**
 * 
 */
package com.bharat.db.oauth.service;

import org.springframework.stereotype.Service;

import com.bharat.db.oauth.model.Data;

/**
 * @author ErBharatp
 *
 */
@Service
public interface DataService {
	public Data save(Data data);
}
