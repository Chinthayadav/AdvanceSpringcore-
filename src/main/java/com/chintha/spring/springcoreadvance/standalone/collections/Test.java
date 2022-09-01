package com.chintha.spring.springcoreadvance.standalone.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		ApplicationContext ctx = new ClassPathXmlApplicationContext(
				"com/chintha/spring/springcoreadvance/standalone/collections/config.xml");
		Productlist pl = (Productlist) ctx.getBean("Productlist");
		System.out.println(pl);

	}

}
