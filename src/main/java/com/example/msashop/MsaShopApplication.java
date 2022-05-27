package com.example.msashop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class MsaShopApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsaShopApplication.class, args);
	}

}
