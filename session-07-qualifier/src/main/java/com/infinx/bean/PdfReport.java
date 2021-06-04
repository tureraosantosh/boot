package com.infinx.bean;

import org.springframework.stereotype.Component;

@Component("pdf")
public class PdfReport implements IReport {
	
	public PdfReport() {
		System.out.println("PDF Report :: Constructore ");
	}

	@Override
	public void generate() {
		System.out.println("PRint PDF Report ");

	}

}
