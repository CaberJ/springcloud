package cn.caber.springclouddemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableEurekaServer
@EnableDiscoveryClient
public class SpringcloudDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringcloudDemoApplication.class, args);
	}



}
