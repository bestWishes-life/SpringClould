package com.six;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * 端口调整成8762 启动8762的注册中心
 */
@SpringBootApplication
@EnableEurekaServer
public class RegisterCenterApplication2 {
    public static void main(String[] args) {
        SpringApplication.run(RegisterCenterApplication2.class);
    }
}
