package io.chase.springbootquickstart.topic;

import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * This interface handles the CRUD operations for a Topic. No body needed.
 * 
 * CrudRepository<[model, [primary key type]>
 * 
 * @author Trevor Chase
 *
 */
public interface TopicRepository extends MongoRepository<Topic, String> {

}
