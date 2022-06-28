package com.studentinformation.Student.ESentity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.springframework.data.elasticsearch.annotations.Document;

@Entity
@Document(indexName="favoritestudents", shards = 1, createIndex = true)
public class Student {
	
	@Id
	private long id;
	private String title;
	private String description;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	public Student(long id, String title, String description) {
		super();
		this.id = id;
		this.title = title;
		this.description = description;
	}
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	
	

}
