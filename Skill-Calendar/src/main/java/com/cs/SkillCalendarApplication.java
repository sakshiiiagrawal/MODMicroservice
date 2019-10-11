package com.cs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class SkillCalendarApplication {

	public static void main(String[] args) {
		SpringApplication.run(SkillCalendarApplication.class, args);
	}

}
