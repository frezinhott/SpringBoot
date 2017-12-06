package io.chase.springbootquickstart;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @SpringBootApplication tells spring boot that this is the main starting point for the application
 * 
 * @author Trevor Chase
 *
 */

@SpringBootApplication
public class CourseApiApp {

	public static void main(String[] args) {
		
		/**
		 * Create the servlet container (Tomcat) and host this application in the servlet container 
		 * 
		 * -- Sets up the default configuration
		 * -- Starts the Spring application context
		 * -- Performs the class path scan
		 * -- Starts the Tomcat server
		 * 
		 */
		SpringApplication.run(CourseApiApp.class, args);
		

	}

}
