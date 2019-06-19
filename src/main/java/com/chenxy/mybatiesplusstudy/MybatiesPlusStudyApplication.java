package com.chenxy.mybatiesplusstudy;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.chenxy.mybatiesplusstudy.dao")
public class MybatiesPlusStudyApplication {

	public static void main(String[] args) {
		SpringApplication.run(MybatiesPlusStudyApplication.class, args);
	}

}
