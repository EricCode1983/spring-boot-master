package com.example.log;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


//https://blog.csdn.net/qq_25868207/article/details/78085673
@SpringBootApplication
public class LogApplication {
	private static final Logger log = LoggerFactory.getLogger(LogApplication.class);




	public static void main(String[] args) {
		SpringApplication.run(LogApplication.class, args);
		log.info("start log");
	}
}
