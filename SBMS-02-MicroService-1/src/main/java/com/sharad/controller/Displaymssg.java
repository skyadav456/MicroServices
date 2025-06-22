package com.sharad.controller;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Displaymssg {
	
	@Value("${spring.application.instance-id}")
	private String instance_id;
	
	
	@GetMapping("/display")
	public String message() {
		
		LocalDateTime ldt = LocalDateTime.now();
		int monthValue = ldt.getMonthValue();
		String seasonName=null;
		
		if(monthValue<=7 && monthValue<10) {
			seasonName = "Rainy season";
		}else if (monthValue>=3 && monthValue<6) {
			seasonName="Summer Season";
		}else {
			seasonName="Winter Season";
		}
		
		seasonName=seasonName +"--"+ instance_id;
		return seasonName;
	}

}
