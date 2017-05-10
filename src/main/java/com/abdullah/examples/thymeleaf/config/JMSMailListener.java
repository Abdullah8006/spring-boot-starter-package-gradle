/**
 * 
 */
package com.abdullah.examples.thymeleaf.config;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

/**
*  
* 
*
* @author  Abdullah Gorakhpur
* @version 1.0
* @since   May 8, 2017
*/
@Component
public class JMSMailListener {

	@JmsListener(destination = "sample", containerFactory = "jmsListenerContainerFactory")
	public void receiveTopicMessage(String email) {
		System.out.println("Topic Two received :" + email);
	}

}