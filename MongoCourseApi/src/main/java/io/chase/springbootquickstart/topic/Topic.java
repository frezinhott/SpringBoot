package io.chase.springbootquickstart.topic;

import org.springframework.data.mongodb.core.mapping.Document;

import io.chase.springbootquickstart.course.Course;

import java.util.List;

import org.springframework.data.annotation.Id;

/**
 * @Entity - Maps this model class to the table "topic"
 * @author Trevor Chase
 *
 */

@Document
public class Topic {
	
	/**
	 * @Id - Makes the id variable the primary key in the topic table
	 */
	@Id
	private String id;
	private String name;
	private String description;
	private List<Course> courses;
	
	public Topic() {

	}	
	
	public Topic(String id, String name, String description) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}

	public List<Course> getCourses() {
		return courses;
	}

	public void setCourses(List<Course> courses) {
		this.courses = courses;
	}
	
}
