package com.example.ex.service.consumer.item;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication(scanBasePackages = "com.example.ex", exclude = {DataSourceAutoConfiguration.class})
@EnableDiscoveryClient
//@EnableSwagger2
@EnableFeignClients
public class ConsumerItemApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConsumerItemApplication.class, args);
	}
}
