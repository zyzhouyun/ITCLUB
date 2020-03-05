package com.dream.itclub;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@MapperScan("com.dream.itclub.dao")
@EnableCaching
@EnableTransactionManagement //开启事务
@SpringBootApplication
public class ItclubApplication {

    public static void main(String[] args) {
        SpringApplication.run(ItclubApplication.class, args);
    }
}
