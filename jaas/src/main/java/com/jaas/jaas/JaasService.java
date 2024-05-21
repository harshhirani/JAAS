package com.jaas.jaas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.flyway.FlywayAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = { DataSourceAutoConfiguration.class, FlywayAutoConfiguration.class })
public class JaasService {
	public static void main(String[] args) {
		SpringApplication.run(JaasService.class, args);
	}

}
