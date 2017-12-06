package io.chase.springbootquickstart.topic;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * @Entity - Maps this model class to the table "topic"
 * @author Trevor Chase
 *
 */

@Entity
public class Topic {
	
	/**
	 * @Id - Makes the id variable the primary key in the topic table
	 */
	@Id
	private String id;
	private String name;
	private String description;
	
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
	
}
