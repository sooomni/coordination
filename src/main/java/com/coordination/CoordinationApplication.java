package com.coordination;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.coordination.goods.mapper")
public class CoordinationApplication {

	public static void main(String[] args) {
		SpringApplication.run(CoordinationApplication.class, args);
	}

}
