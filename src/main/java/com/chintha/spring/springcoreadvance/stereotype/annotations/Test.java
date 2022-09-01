package com.chintha.spring.springcoreadvance.stereotype.annotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		ApplicationContext ctx = new ClassPathXmlApplicationContext(
				"com/chintha/spring/springcoreadvance/stereotype/annotations/config.xml");
		Instructor instructor = (Instructor) ctx.getBean("instructor");
		System.out.println(instructor);
		
		Instructor instructor1 = (Instructor) ctx.getBean("instructor");
		System.out.println(instructor1);
 
	}

}
