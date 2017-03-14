package com.yodhaa.mdm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableAutoConfiguration
@ComponentScan(basePackages="com.yodhaa.mdm")
public class MdmApplication {

	public static void main(String[] args) {
		SpringApplication.run(MdmApplication.class, args);
	}
}
