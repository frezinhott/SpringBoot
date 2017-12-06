package io.chase.springbootquickstart.topic;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import io.chase.springbootquickstart.course.CourseService;

/**
 * Spring Controller
 * -- A Java class marked with annotations
 * -- Has info about:
 *	  -- What URL access triggers it?
 *	  -- What method to run when accessed?
 *
 *	Example Topic in JSON format
 *	{
 *		"id": "java"
 *		"name": "Java"
 *		"description": "Java Description"
 *	}
 *
 * @RestController - Tells spring that this is a REST controller.  Response is JSON by default
 * 
 * @author Trevor Chase
 *
 */
@RestController
public class TopicController {
	/**
	 * @Autowired - specifies that this variable needs dependency injection.  
	 * Automatically creates a single instance of TopicService when this class is accessed by the /topics URI.
	 */
	@Autowired
	private TopicService topicService;
	@Autowired
	private CourseService courseService;
	
	/**
	 * @RequestMapping - Maps the /topics resource URL to a method
	 * http://localhost:8080/topics
	 * 
	 * @return List<Topic>
	 */
	@RequestMapping("/topics")
	public List<Topic> getAllTopics() {
		
		List<Topic> topics = topicService.getAllTopics();
		for(Topic topic : topics) {
			topic.setCourses(courseService.getAllCourses(topic.getId()));
		}
		return topics;
				
	}
	
	/**
	 * @RequestMapping("/topics/{id}") - Maps the /topics/{id} resource URL to a method
	 * http://localhost:8080/topics/{id}
	 * 
	 * @PathVariable("id") - Maps the URI variable {id} to the path variable id
	 * 
	 * @return Topic
	 */
	@RequestMapping("/topics/{id}")
	public Topic getTopic(@PathVariable("id") String id) {
		Topic topic = topicService.getTopic(id);
		topic.setCourses(courseService.getAllCourses(id));
		return topic;
	}

	/**
	 * @RequestMapping(value="/topics", method=RequestMethod.POST) - Maps the method to the /topics resource URL POST
	 * @RequestBody - Maps the post body to the topic variable
	 * http://localhost:8080/topics
	 * 
	 * When posting, update the header Content-Type=application/json
	 */
	@RequestMapping(value="/topics", method=RequestMethod.POST)
	public void addTopic(@RequestBody Topic topic) {
		topicService.addTopic(topic);
	}
	
	/**
	 * @RequestMapping(value="/topics", method=RequestMethod.PUT) - Maps the method to the /topics/{id} resource URL PUT
	 * @RequestBody - Maps the post body to the topic variable
	 * http://localhost:8080/topics/{id}
	 * 
	 * When posting, update the header Content-Type=application/json
	 */
	@RequestMapping(value="/topics/{id}", method=RequestMethod.PUT)
	public void updateTopic(@RequestBody Topic topic , @PathVariable("id") String id) {
		topicService.updateTopic(id, topic);
	}
	
	/**
	 * @RequestMapping("/topics/{id}") - Maps the method to the /topics/{id} resource URL DELETE
	 * http://localhost:8080/topics/{id}
	 * 
	 * @PathVariable("id") - Maps the URI variable {id} to the path variable id
	 * 
	 */
	@RequestMapping(value="/topics/{id}", method=RequestMethod.DELETE)
	public void deleteTopic(@PathVariable("id") String id) {
		topicService.deleteTopic(id);
	}
}
