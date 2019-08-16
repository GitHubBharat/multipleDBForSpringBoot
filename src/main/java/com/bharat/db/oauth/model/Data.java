package com.bharat.db.oauth.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
/**
 * 
 * @author ErBharatp
 *
 */
@Entity
@Table(name = "data")
public class Data {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private 	Long id;

	@Column(name = "title")
	private String title;

	private String address; 

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getTitle() {
		return this.title;
	}

	public Data(String title) {
		super();
		this.title = title;
	}

	public Data() {
	}

	@Override
	public String toString() {
		return "Data [id=" + id + ", title=" + title + "]";
	}

}