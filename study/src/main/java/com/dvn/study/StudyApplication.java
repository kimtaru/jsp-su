package com.dvn.study;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class StudyApplication extends SpringBootServletInitializer {

	// war 빌드 설정
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(StudyApplication.class);
	}
	
	public static void main(String[] args) {
		SpringApplication.run(StudyApplication.class, args);
	}

}
