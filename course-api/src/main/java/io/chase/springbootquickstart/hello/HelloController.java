package io.chase.springbootquickstart.hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Spring Controller
 * -- A Java class marked with annotations
 * -- Has info about:
 *	  -- What URL access triggers it?
 *	  -- What method to run when accessed?
 *
 * @RestController - Tells spring that this is a REST controller.  Response is JSON by default
 * 
 * @author Trevor Chase
 *
 */
@RestController
public class HelloController {

	/**
	 * Maps the resource URL to a method
	 * http://localhost:8080/hello
	 * 
	 * @return "Hi"
	 */
	@RequestMapping("/hello")
	public String sayHi() {
		return "Hi";
	}
}
