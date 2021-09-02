package com.likeurator.squadmania;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.mongodb.config.EnableMongoAuditing;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;


@SpringBootApplication @EnableAutoConfiguration @EnableMongoAuditing @EnableMongoRepositories 
public class SquadmaniaApplication {
	public static void main(String[] args) {
		SpringApplication.run(SquadmaniaApplication.class, args);
	}
/*
	@Bean
	PasswordEncoder passwordEncoder(){
		return new BCryptPasswordEncoder();
	}
	*/
}
