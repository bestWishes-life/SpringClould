[TOC]
# 创建父项目
  > 创建普通maven项目
  ## 加入.gitignore文件
   > .gitignore用于git提交的时候忽略文件
   ```
   /target/
!.mvn/wrapper/maven-wrapper.jar

### STS ###
.apt_generated
.classpath
.factorypath
.project
.settings
.springBeans
.sts4-cache

### IntelliJ IDEA ###
.idea
*.iws
*.iml
*.ipr

### log ###
*.log
*.log.*

### NetBeans ###
/nbproject/private/
/build/
/nbbuild/
/dist/
/nbdist/
/.nb-gradle/

### Mac ###
*.DS_Store
   ```
  ## pom添加依赖
  ```
  <!-- 引入 Spring Boot 的依赖 -->
    <parent>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-parent</artifactId>
        <version>2.0.7.RELEASE</version>
    </parent>

    <dependencies>
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-web</artifactId>
        </dependency>
    </dependencies>

    <!-- 引入 Spring Cloud 的依赖，管理 Spring Cloud 各组件 -->
    <dependencyManagement>
        <dependencies>
            <dependency>
                <groupId>org.springframework.cloud</groupId>
                <artifactId>spring-cloud-dependencies</artifactId>
                <version>Finchley.SR2</version>
                <type>pom</type>
                <scope>import</scope>
            </dependency>
        </dependencies>
    </dependencyManagement>
  ```
  # 注册中心
  [registerCenter(Eureka Server)](https://github.com/Zealon159/)