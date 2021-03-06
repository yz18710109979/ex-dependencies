package com.example.ex.service.reg;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableAsync;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@EnableDiscoveryClient
@ComponentScan(basePackages = "com.example.ex")
@MapperScan(basePackages = "com.example.ex.commons.mapper")
@EnableBinding({Source.class})
@EnableAsync
public class RegApplication {

	public static void main(String[] args) {
		SpringApplication.run(RegApplication.class, args);
	}
}
