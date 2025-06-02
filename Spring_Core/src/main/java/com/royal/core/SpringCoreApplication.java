package com.royal.core;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.royal.core.ioc.AppConfig;

@SpringBootApplication
public class SpringCoreApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCoreApplication.class, args);
		
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		
		System.out.println(context.getBean("foodItem1").toString());
		System.out.println(context.getBean("foodItem2").toString());
		
		System.out.println(context.getBean("p1").toString());
		System.out.println(context.getBean("p2").toString());
		
	}

}
