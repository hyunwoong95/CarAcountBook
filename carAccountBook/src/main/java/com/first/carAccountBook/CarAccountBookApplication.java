package com.first.carAccountBook;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.first.carAccountBook"})
public class CarAccountBookApplication {

	public static void main(String[] args) {
		SpringApplication.run(CarAccountBookApplication.class, args);
	}

}
