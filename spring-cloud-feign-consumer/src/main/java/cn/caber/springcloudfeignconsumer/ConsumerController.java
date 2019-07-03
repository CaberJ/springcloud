package cn.caber.springcloudfeignconsumer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.net.URI;

@RestController
public class ConsumerController {


    @Autowired
    private HomeClient homeClient;

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping(value = "/hello")
    public String hello() {
        return  homeClient.consumer();
    }

    @GetMapping(value = "/hello1")
    public String hello1() {
//        String appName = "eureka-provider";
//        String appName = "EUREKA-PROVIDER";
        String appName ="desktop-d3859ii";
        String libai = restTemplate.getForObject("http://" + appName + ":8081/abc?name={0}", String.class, "libai");

        return  libai;
    }
}
