package com.demo.app;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//配置Mapper扫描路径
@MapperScan("com.demo.**.mapper")
public class BootDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(BootDemoApplication.class, args);
    }

}
