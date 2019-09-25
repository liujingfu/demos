package com.ljf.oauth2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * description
 *
 * @author ljf 2019/09/24 20:48
 */
@SpringBootApplication
@MapperScan(basePackages = "com.ljf.oauth2.mapper")
public class OAuth2ResourceApplication {

    public static void main(String[] args) {
        SpringApplication.run(OAuth2ResourceApplication.class, args);
    }
}
