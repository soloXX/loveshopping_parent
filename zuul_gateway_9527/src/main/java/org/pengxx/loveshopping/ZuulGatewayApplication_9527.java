package org.pengxx.loveshopping;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableEurekaClient //标识是Eureka的客户端
@EnableZuulProxy //启用网关
public class ZuulGatewayApplication_9527 {
    public static void main(String[] args) {
        SpringApplication.run(ZuulGatewayApplication_9527.class);
    }
}
