package com.atguigu.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * A.引入SpringSecurity
 * B.编写SpringSecurity配置类
 *      @EnableWebSecurity
 *      public class MySecurityConfig extends WebSecurityConfigurerAdapter
 * C.
 * @author YongZhang
 *
 */
@SpringBootApplication
public class SpringBootSecurityApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootSecurityApplication.class, args);
	}

}
