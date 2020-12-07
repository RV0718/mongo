package com.mongo.morphia;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.mongo.embedded.EmbeddedMongoAutoConfiguration;

@SpringBootApplication(exclude = EmbeddedMongoAutoConfiguration.class)
public class MongoMorphiaApplication {

	public static void main(String[] args) {
		SpringApplication.run(MongoMorphiaApplication.class, args);
	}

}
