package com.chintha.spring.springboot.propertyplaceholder;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/chintha/spring/springboot/propertyplaceholder/config.xml");
		MyDAO dao = (MyDAO) context.getBean("MyDAO");
		System.out.println(dao);

	}

}
