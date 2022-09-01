package com.chintha.spring.springcoreadvance.autowiring.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		ApplicationContext ctx = new ClassPathXmlApplicationContext(
				"com/chintha/spring/springcoreadvance/autowiring/annotation/config.xml");
		Customer c = (Customer) ctx.getBean("Customer");
		System.out.println(c);

	}

}
