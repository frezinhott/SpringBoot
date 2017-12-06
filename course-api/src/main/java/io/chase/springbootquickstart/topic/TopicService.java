package io.chase.springbootquickstart.topic;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Service marks this class as a business service.  This service acts as a singleton having only one instance.
 * 
 * @author Trevor Chase
 *
 */

@Service
public class TopicService {
	
	/**
	 * @Autowired - specifies that this variable needs dependency injection.  
	 * Automatically creates a single instance of TopicRepository when this class is accessed.
	 */
	@Autowired
	private TopicRepository topicRepository;
	
	/**
	 * Get all Topics in the DB
	 * @return List<Topic>
	 */
	public List<Topic> getAllTopics() {
		List<Topic> topics = new ArrayList<>();
		
		/**
		 * .findAll()  - finds all topics in the DB
		 * .forEach()  - iterates through each topic
		 * topics::add - A method reference that adds the current topic to the topics list
		 */
		topicRepository.findAll().forEach(topics::add);
		return topics;
	}
	
	/**
	 * Get a single Topic
	 * @return Topic
	 */
	public Topic getTopic(String id) {
		return topicRepository.findOne(id);
	}

	/**
	 * Adds a topic to the topics list
	 */
	public void addTopic(Topic topic) {
		topicRepository.save(topic);
	}

	/**
	 * Updates a topic to the topics list
	 */
	public void updateTopic(String id, Topic topic) {
		
		// .save() will check to see if the primary key exists.  If it does, it will perform an update.
		topicRepository.save(topic);
	}

	/**
	 * Removes a topic from the topics list
	 */
	public void deleteTopic(String id) {
		
		topicRepository.delete(id);
	}

}
