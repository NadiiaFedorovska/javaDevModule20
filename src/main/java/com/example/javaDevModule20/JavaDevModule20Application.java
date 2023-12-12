package com.example.javaDevModule20;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JavaDevModule20Application {

	public static void main(String[] args) {
		SpringApplication.run(JavaDevModule20Application.class, args);
		Calculator calculator = new Calculator();

		System.out.println("calculator.addition(1,2) = " + calculator.addition(1, 2));
	}

}
