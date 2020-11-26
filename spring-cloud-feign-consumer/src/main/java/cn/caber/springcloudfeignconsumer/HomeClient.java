package cn.caber.springcloudfeignconsumer;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value = "eureka-provider")
public interface HomeClient {

    @GetMapping(value = "/test1")
    String consumer1();

    @GetMapping(value = "/test2")
    String consumer2();
}
