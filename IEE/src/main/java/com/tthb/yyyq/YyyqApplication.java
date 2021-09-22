package com.tthb.yyyq;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.tthb.yyyq.mapper")
public class YyyqApplication {

    public static void main(String[] args) {
        SpringApplication.run(YyyqApplication.class, args);
    }

}
