package com.example.cepservices;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class CepservicesApplication {

	public static void main(String[] args) {
		SpringApplication.run(CepservicesApplication.class, args);
	}

}
