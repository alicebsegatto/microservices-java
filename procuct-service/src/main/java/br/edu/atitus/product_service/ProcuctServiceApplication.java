package br.edu.atitus.product_service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class ProcuctServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProcuctServiceApplication.class, args);
	}

}
