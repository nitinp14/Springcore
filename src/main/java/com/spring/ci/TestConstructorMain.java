package com.spring.ci;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestConstructorMain {
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("com/spring/ci/ConfigCi.xml");
		Person p=(Person) context.getBean("person");
		System.out.println(p);
		
		Addition add=(Addition)context.getBean("add");
		add.doSum();
//		priority will be given to String 
//		.if not then sequencial order from top to bottom will be followed
//		we can specify the type="int" and index(starting is 0 index)
	}
}
