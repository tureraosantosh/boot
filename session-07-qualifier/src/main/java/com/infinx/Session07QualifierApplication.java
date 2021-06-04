package com.infinx;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.infinx.service.ReportService;

@SpringBootApplication
public class Session07QualifierApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Session07QualifierApplication.class, args);
		ReportService reportService = context.getBean(ReportService.class);
		reportService.generateReport();
	}

}
