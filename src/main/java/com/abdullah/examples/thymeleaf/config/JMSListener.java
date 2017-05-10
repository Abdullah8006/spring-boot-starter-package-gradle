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
 * @author Abdullah Gorakhpur
 * @version 1.0
 * @since May 7, 2017
 */
@Component
public class JMSListener {

	@JmsListener(destination = "sample", containerFactory = "jmsListenerContainerFactory")
	public void receiveTopicMessage(String email) {
		System.out.println("Topic One received :" + email);
	}

}