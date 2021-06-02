package com.infinx;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import in.infinx.Student;

@SpringBootApplication
@ComponentScan(basePackages= {"in.infinx","com.infinx"})
public class Session05ComponentScanApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Session05ComponentScanApplication.class, args);

		Teacher teacher = context.getBean(Teacher.class);
		System.out.println(teacher);

		Student student = context.getBean(Student.class);

		System.out.println(student);
	}

}
