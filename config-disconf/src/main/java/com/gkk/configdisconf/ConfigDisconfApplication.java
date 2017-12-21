package com.gkk.configdisconf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@ImportResource({"classpath:conf/spring-disconf.xml"})
@SpringBootApplication
public class ConfigDisconfApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConfigDisconfApplication.class, args);
	}
}
