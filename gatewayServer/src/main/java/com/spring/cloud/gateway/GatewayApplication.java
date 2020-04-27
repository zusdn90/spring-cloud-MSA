package com.spring.cloud.gateway;

import com.spring.cloud.gateway.filters.GatewayErrorFilter;
import com.spring.cloud.gateway.filters.GatewayPostFilter;
import com.spring.cloud.gateway.filters.GatewayPreFilter;
import com.spring.cloud.gateway.filters.GatewayRouteFilter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

@EnableZuulProxy    // Gateway 서버 활성화
@SpringBootApplication
public class GatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(GatewayApplication.class, args);
    }

    @Bean
    public GatewayPreFilter preFilter() {
        return new GatewayPreFilter();
    }

    @Bean
    public GatewayPostFilter postFilter() {
        return new GatewayPostFilter();
    }
    @Bean
    public GatewayRouteFilter routeFilter() {
        return new GatewayRouteFilter();
    }
    @Bean
    public GatewayErrorFilter errorFilter() {
        return new GatewayErrorFilter();
    }

}
