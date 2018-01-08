package com.glqdlt.chatmanager;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = "com.glqdlt.*")
@SpringBootApplication
public class ChatManagerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ChatManagerApplication.class, args);
	}
}
