package com.server.xofome;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.orm.jpa.EntityScan;

@SuppressWarnings("deprecation")
@EntityScan(basePackages = {
        "com.server.xofome.model", "com.server.xofome.repository", "com.server.xofome.service", "com.server.xofome.controller"
        })

@SpringBootApplication
public class XoFomeApplication {

	public static void main(String[] args) {
		SpringApplication.run(XoFomeApplication.class, args);
	}
}
