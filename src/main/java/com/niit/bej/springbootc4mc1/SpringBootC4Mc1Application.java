package com.niit.bej.springbootc4mc1;

import com.niit.bej.springbootc4mc1.service.MessageService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBootC4Mc1Application {

	public static void main(String[] args) {
		ApplicationContext applicationContext = SpringApplication.run(SpringBootC4Mc1Application.class, args);
		MessageService messageService = applicationContext.getBean(MessageService.class);
		messageService.displayMessage();
	}

}
