package com.capgemini.wsb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
public class WsbJpaApplication {

	public static void main(String[] args) {
		SpringApplication.run(WsbJpaApplication.class, args);
	}
}
