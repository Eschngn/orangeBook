package com.swc.orangeBook.search.biz;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * @author Wilson
 * @Description: TODO
 * @date 2025/1/13 22:30
 */
@SpringBootApplication
@EnableScheduling
@MapperScan("com.swc.orangeBook.search.biz.domain.mapper")
public class OrangeBookSearchApplication {
    public static void main(String[] args) {
        SpringApplication.run(OrangeBookSearchApplication.class);
    }
}
