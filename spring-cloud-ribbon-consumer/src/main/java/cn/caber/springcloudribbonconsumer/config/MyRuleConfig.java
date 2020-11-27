package cn.caber.springcloudribbonconsumer.config;

import cn.caber.springcloudribbonconsumer.rule.MyRule;
import com.netflix.loadbalancer.IRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyRuleConfig {

    @Bean
    public IRule myRule() {
        return new MyRule();
    }
}
