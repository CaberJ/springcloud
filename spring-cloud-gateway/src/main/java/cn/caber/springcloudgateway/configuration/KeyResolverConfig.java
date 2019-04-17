package cn.caber.springcloudgateway.configuration;

import org.springframework.cloud.gateway.filter.ratelimit.KeyResolver;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import reactor.core.publisher.Mono;

@Configuration
public class KeyResolverConfig {

    //针对ip限流
    @Bean
    public KeyResolver ipKeyResolver(){

        return exchange -> Mono.just(exchange.getRequest().getRemoteAddress().getHostName());
    }

    //针对url限流
    @Bean
    KeyResolver uriKeyResolver() {
        return exchange -> Mono.just(exchange.getRequest().getPath().value());
    }

    //针对用户限流，使用这种方式限流，请求路径中必须携带userId参数
    @Bean
    KeyResolver userKeyResolver() {
        return exchange -> Mono.just(exchange.getRequest().getQueryParams().getFirst("userId"));
    }

}
