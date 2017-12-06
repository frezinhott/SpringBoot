package io.chase.springbootquickstart.course;

import org.springframework.data.mongodb.core.mapping.Document;

import org.springframework.data.annotation.Id;

/**
 * @Document - Maps this model class to a Mongo Document "course"
 * @author Trevor Chase
 *
 */

@Document
public class Course {
	
	/**
	 * @Id - Makes the id variable the primary key in the course table
	 */
	@Id
	private String id;
	private String topicId;
	private String name;
	private String description;
	
	public Course() {

	}	
	
	public Course(String id, String name, String description, String topicId) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.topicId = topicId;
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

	public String getTopicId() {
		return topicId;
	}

	public void setTopicId(String topicId) {
		this.topicId = topicId;
	}
	
}
