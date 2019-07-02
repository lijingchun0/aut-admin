package com.ljc.admin;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement
@MapperScan("com.ljc.admin.dao")
public class AutAdminApplication {

    public static void main(String[] args) {
        SpringApplication.run(AutAdminApplication.class, args);
    }

}
