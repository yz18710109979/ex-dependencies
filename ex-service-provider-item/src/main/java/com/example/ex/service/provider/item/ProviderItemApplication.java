package com.example.ex.service.provider.item;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication(scanBasePackages = "com.example.ex")
@EnableDiscoveryClient
@MapperScan(basePackages = "com.example.ex.commons.mapper")
//@EnableSwagger2
public class ProviderItemApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProviderItemApplication.class, args);
	}
}
