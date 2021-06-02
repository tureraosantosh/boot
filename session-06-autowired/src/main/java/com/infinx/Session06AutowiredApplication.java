package com.infinx;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.infinx.controller.UserController;

@SpringBootApplication
public class Session06AutowiredApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Session06AutowiredApplication.class, args);

		UserController userController = context.getBean(UserController.class);

		String saveData = userController.saveData("Santosh");

		System.out.println(saveData);

	}

}
