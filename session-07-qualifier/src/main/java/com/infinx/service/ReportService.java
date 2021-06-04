package com.infinx.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.infinx.bean.IReport;

@Service
public class ReportService {

	@Autowired
	private IReport iReport;

	public void generateReport() {
		iReport.generate();
	}

}
