package org.pengxx.loveshopping;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * 平台服务入口类
 */
@SpringBootApplication
@EnableEurekaClient
public class PlatApplication_8001 {
    public static void main(String[] args) {
        SpringApplication.run(PlatApplication_8001.class);
    }
}
