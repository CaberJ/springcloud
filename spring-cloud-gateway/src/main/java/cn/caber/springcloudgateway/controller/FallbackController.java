package cn.caber.springcloudgateway.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
public class FallbackController {

    @RequestMapping("/fallback")
    public String fallback(){
        HashMap<String, Object> map = new HashMap<>();
        map.put("code","1111");
        map.put("message","熔断了");
        System.out.println("熔断了");
        return "暂时不可用";
    }
}
