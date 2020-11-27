package cn.caber.springcloudribbonconsumer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ConsumerController {

    @Autowired
    @LoadBalanced
    private RestTemplate restTemplate;


    @GetMapping(value = "/hello")
    public String hello() {

        return restTemplate.getForEntity("http://eureka-provider/abc", String.class).getBody();
    }
}
