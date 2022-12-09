package com.restaurant.nearByRest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan(basePackages = "com.restaurant.nearByRest")
public class NearByRestApplication {

	public static void main(String[] args) {
		SpringApplication.run(NearByRestApplication.class, args);
	}

}
