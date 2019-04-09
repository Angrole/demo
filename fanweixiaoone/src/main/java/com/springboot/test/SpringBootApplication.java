package com.springboot.test;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.context.annotation.ComponentScan;


/**
 * Created by liuzehai on 2017/12/19.
 */
@MapperScan("com.springboot.test.dao")
@ComponentScan("com.springboot.test.*")
@org.springframework.boot.autoconfigure.SpringBootApplication
public class SpringBootApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootApplication.class, args);
    }


}
