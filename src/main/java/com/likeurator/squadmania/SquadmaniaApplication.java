package com.likeurator.squadmania;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.mongodb.config.EnableMongoAuditing;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@EnableAutoConfiguration
@EnableJpaAuditing
@EnableJpaRepositories
@EnableMongoAuditing
@EnableMongoRepositories
@SpringBootApplication
public class SquadmaniaApplication {
	public static void main(String[] args) {
		SpringApplication.run(SquadmaniaApplication.class, args);
	}

}
