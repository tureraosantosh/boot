package com.infinx.bean;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("excel")
@Primary
public class ExcelReport implements IReport {
	
	public ExcelReport() {
		System.out.println("Excel :: Constructoer execute ");
	}

	@Override
	public void generate() {
	System.out.println("Print Excel Report ");

	}

}
