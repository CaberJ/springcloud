package cn.caber.springcloudribbonconsumer;

import cn.caber.springcloudribbonconsumer.config.MyRuleConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClients;

@SpringBootApplication
@EnableEurekaClient
//@EnableDiscoveryClient
@RibbonClients(defaultConfiguration = MyRuleConfig.class)
public class SpringCloudRibbonConsumerApplication {


	public static void main(String[] args) {
		SpringApplication.run(SpringCloudRibbonConsumerApplication.class, args);
	}

}
