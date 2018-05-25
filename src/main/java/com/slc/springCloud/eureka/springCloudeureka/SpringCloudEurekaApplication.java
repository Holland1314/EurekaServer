package com.slc.springCloud.eureka.springCloudeureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class SpringCloudEurekaApplication {

/*	org.springframework.security.web.authentication.ui.DefaultLoginPageGeneratingFilter
	 org.springframework.security.web.authentication.www.BasicAuthenticationFilter
	org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter*/
	public static void main(String[] args) {

		SpringApplication.run(SpringCloudEurekaApplication.class, args);
	}
}
