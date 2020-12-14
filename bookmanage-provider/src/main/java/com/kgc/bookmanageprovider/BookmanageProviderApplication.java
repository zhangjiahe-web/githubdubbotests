package com.kgc.bookmanageprovider;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@MapperScan("com.kgc.bookmanageprovider.mapper")
@SpringBootApplication
public class BookmanageProviderApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookmanageProviderApplication.class, args);
	}

}
