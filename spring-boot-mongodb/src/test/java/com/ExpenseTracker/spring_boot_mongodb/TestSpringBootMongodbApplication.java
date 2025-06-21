package com.ExpenseTracker.spring_boot_mongodb;

import org.springframework.boot.SpringApplication;

public class TestSpringBootMongodbApplication {

	public static void main(String[] args) {
		SpringApplication.from(SpringBootMongodbApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
