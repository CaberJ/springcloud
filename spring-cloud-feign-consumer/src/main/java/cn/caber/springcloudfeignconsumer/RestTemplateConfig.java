package cn.caber.springcloudfeignconsumer;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @Description:
 * @Author: zhaikaibo
 * @Date: 2019/6/29 9:24
 */
@Configuration
public class RestTemplateConfig {

    @Bean
    public RestTemplate getRest(){
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate;
    }
}
