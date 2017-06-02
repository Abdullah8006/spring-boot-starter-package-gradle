/**
 * 
 */
package com.abdullah.examples.thymeleaf.mvc;

import java.util.Arrays;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
*
* @author  Abdullah Gorakhpur
* @version 1.0
* @since   May 23, 2017
*/
@RestController
@RequestMapping("/api/v1/user")
public class UserController {

	private Log LOG = LogFactory.getLog(IndexController.class);
	private static List<String> userNames = Arrays.asList(new String[]{"Inam", "Fatima", "Sadaf", "Amma"});	
	
	@RequestMapping(method = RequestMethod.GET)
	@ResponseBody
	public List<String> getUserNames(){
		LOG.info("Getting a list of usernames.");
		return userNames;
	}
	
	
}
