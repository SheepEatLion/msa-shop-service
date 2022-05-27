package com.example.msashop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableFeignClients
@EnableEurekaClient
@EnableJpaAuditing
@SpringBootApplication
public class MsaShopApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsaShopApplication.class, args);
	}

}
