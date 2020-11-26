package cn.caber.springcloudeurekaprovider;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableEurekaClient
@RestController
public class SpringCloudEurekaProviderApplication {

	@Value("${server.port}")
	String port;

	@RequestMapping("/test1")
	public String home1() {
        System.out.println("Hello world1"+port);
		return "Hello world1"+port;
	}

	@RequestMapping("/test2")
	public String home2() {
		System.out.println("Hello world2"+port);
		return "Hello world2"+port;
	}



	public static void main(String[] args) {
		SpringApplication.run(SpringCloudEurekaProviderApplication.class, args);
	}

}
