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

	@RequestMapping("/abc")
	public String home() {
        System.out.println("Hello world"+port);
		return "Hello world"+port;
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudEurekaProviderApplication.class, args);
	}

}
