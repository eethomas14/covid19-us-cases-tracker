package com.practice.covid19uscasestracker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class Covid19UsCasesTrackerApplication {

	public static void main(String[] args) {
		SpringApplication.run(Covid19UsCasesTrackerApplication.class, args);
	}

}
