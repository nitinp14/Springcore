package com.springcore.collections;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ExecuteEmp {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		ApplicationContext context = 
				new ClassPathXmlApplicationContext("com/springcore/collections/ConfigCollection.xml");
		 Emp emp1=(Emp) context.getBean("employee");
		 System.out.println(emp1.getAddresses());
		 System.out.println(emp1.getName());
		 System.out.println(emp1.getCourses());
		
		 System.out.println(emp1);
	}
}
