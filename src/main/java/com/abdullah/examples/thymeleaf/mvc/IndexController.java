package com.abdullah.examples.thymeleaf.mvc;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author Abdullah Gorakhpur
 */
@Controller
@RequestMapping(value = "/")
public class IndexController {

	private Log LOG = LogFactory.getLog(IndexController.class);
	private JmsTemplate jmsTemplate;

	@Autowired
	public IndexController(JmsTemplate jmsTemplate) {
		super();
		this.jmsTemplate = jmsTemplate;
	}

	@RequestMapping(method = RequestMethod.GET)
	public String index(ModelMap map) {
		LOG.info("Index controller is hit!!");
		System.out.println("Sending a JMS message.");
		jmsTemplate.convertAndSend("sample", "abeiy4u@gmail.com");
		return "main";
	}

}
