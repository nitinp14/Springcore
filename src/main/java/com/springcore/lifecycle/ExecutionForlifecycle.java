package com.springcore.lifecycle;


import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ExecutionForlifecycle {
public static void main(String[] args) {
	AbstractApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/lifecycle/ConfigLifecycle.xml");
//	Samosa s1=(Samosa) context.getBean("s1");
//	System.out.println(s1);
//	
//	registering shutdown by Abstract class
	context.registerShutdownHook();
	
//	System.out.println("==================================");
//	Pepsi p1 = (Pepsi) context.getBean("p1");
//	System.out.println(p1);
	
	Example e=(Example) context.getBean("example");
	System.out.println(e);
}
}
