## 父项目中创建新的Module
> registerCenter
## pom中引入依赖
```
<dependencies>
        <dependency>
            <groupId>org.springframework.cloud</groupId>
            <artifactId>spring-cloud-starter-netflix-eureka-server</artifactId>
        </dependency>
</dependencies>
```
## 在resources路径下创建application.yml配置文件
```
server:
  port: 8761 #当前 Eureka Server 服务端口。
spring:
  application:
    name: registerCenter
eureka:
  client:
    register-with-eureka: true #是否将当前 Eureka Server 服务作为客户端进行注册。
    fetch-registry: false #是否获取其他 Eureka Server 服务的数据。如果是注册中心集成那么需要true
    service-url:
      defaultZone: http://localhost:8761/eureka/  #注册中心的访问地址。如果是集成，中间以逗号相隔
```
## 创建启动类RegisterCenterApplication
> 注意：springboot的启动类需要在子级父包下，不可以放在默认包。这个项目中子级父包是com.six，随着代码完善可能还会存在com.six.server包，com.six.entity包
```
package com.six;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class RegisterCenterApplication {
    public static void main(String[] args) {
        SpringApplication.run(RegisterCenterApplication.class);
    }
}

```
运行RegistryCenter，打开http://localhost:8761可以看到注册中心启动成功，若配置多个service-url，因为服务不是同一时间启动，所以因为服务未启导致发现不了服务报错，忽略即可。当服务正常启动后，发现服务后就正常了
> 可以在Instances currently registered with Eureka（当前注册的Eureka实例中发现注册中心的实例）