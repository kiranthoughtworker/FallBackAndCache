package com.tw.springmysqlredis;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;

@SpringBootApplication
@EnableHystrix
@EnableCaching
public class SpringMysqlRedisApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringMysqlRedisApplication.class, args);
	}

}
