package com.nttdata.configservicebank;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class ConfigServiceBankApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConfigServiceBankApplication.class, args);
	}

}
