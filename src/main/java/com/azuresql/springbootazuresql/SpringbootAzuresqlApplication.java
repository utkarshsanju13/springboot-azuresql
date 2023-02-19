package com.azuresql.springbootazuresql;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan
public class SpringbootAzuresqlApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootAzuresqlApplication.class, args);
	}

}
