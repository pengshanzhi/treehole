package com.psz.treehole;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("com.psz")
@MapperScan("com.psz")
@SpringBootApplication
public class TreeholeApplication {

	public static void main(String[] args) {
		SpringApplication.run(TreeholeApplication.class, args);
	}

}
