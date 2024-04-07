package com.spring.autowire.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAutowire {
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("com/spring/autowire/annotation/ConfigAutowireAnnotation.xml");
		
		Emp emp1=context.getBean("emp1",Emp.class);
		System.out.println(emp1);
		
//		its working even though we have changed the reference variable
	}
}
