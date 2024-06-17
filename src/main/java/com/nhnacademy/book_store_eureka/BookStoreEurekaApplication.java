package com.nhnacademy.book_store_eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class BookStoreEurekaApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookStoreEurekaApplication.class, args);
	}

}
