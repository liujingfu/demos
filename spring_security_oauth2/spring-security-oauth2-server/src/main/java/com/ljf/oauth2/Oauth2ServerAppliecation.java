package com.ljf.oauth2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * description
 *
 * @author ljf 2019/09/20 15:47
 */
@SpringBootApplication
@MapperScan(basePackages = "com.ljf.oauth2.server.mapper")
public class Oauth2ServerAppliecation {
    public static void main(String[] args) {
        SpringApplication.run(Oauth2ServerAppliecation.class,args);
    }

}
