package com.zl.dubbotest;

import java.io.IOException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {
    public static void main( String[] args) throws IOException {
        SpringApplication.run("classpath:spring-config.xml",args);
        System.out.println("Dubbo server started");
        System.out.println("按任意键退出");
		System.in.read();
    }
}