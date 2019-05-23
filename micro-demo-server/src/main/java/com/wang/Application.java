package com.wang;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;
import wang.boot.starter.dubbo.autoconfigure.DubboAutoConfigure;

/**
 * @author Administrator
 */
@SpringBootApplication
@Import({DubboAutoConfigure.class})
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}