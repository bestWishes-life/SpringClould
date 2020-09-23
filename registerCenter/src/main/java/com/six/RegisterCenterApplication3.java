package com.six;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * 端口调整成8763 启动8763的注册中心
 */
@SpringBootApplication
@EnableEurekaServer
public class RegisterCenterApplication3 {
    public static void main(String[] args) {
        SpringApplication.run(RegisterCenterApplication3.class);
    }
}
