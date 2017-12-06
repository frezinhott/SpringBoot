package io.chase.springbootquickstart.course;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import io.chase.springbootquickstart.topic.Topic;

/**
 * @Entity - Maps this model class to the table "course"
 * @author Trevor Chase
 *
 */

@Entity
public class Course {
	
	/**
	 * @Id - Makes the id variable the primary key in the course table
	 */
	@Id
	private String id;
	private String name;
	private String description;
	
	/**
	 * Establish a many to one relationship
	 */
	@ManyToOne
	private Topic topic;
	
	public Course() {

	}	
	
	public Course(String id, String name, String description, String topicId) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.topic = new Topic(topicId, "", "");
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

	public Topic getTopic() {
		return topic;
	}

	public void setTopic(Topic topic) {
		this.topic = topic;
	}
	
}
