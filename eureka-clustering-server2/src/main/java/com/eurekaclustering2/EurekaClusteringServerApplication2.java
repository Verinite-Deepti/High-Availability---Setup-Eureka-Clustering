package com.eurekaclustering2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaClusteringServerApplication2 {

	public static void main(String[] args) {
		SpringApplication.run(EurekaClusteringServerApplication2.class, args);
	}

}
