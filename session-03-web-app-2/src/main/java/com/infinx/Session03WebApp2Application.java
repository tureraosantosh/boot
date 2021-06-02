package com.infinx;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Session03WebApp2Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Session03WebApp2Application.class, args);

		String[] beanDefinitionNames = context.getBeanDefinitionNames();
		
		int beanDefinitionCount = context.getBeanDefinitionCount();
		System.out.println("Bean Count "+beanDefinitionCount);
		System.out.println(".................Bean Added..........");
		for (String beanName : beanDefinitionNames) {
			System.out.println("bean :: " + beanName);
		}

	}

}
