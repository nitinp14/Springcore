package com.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SaveStudent {
	 public static void main(String[] args) {
		 System.out.println( "Hello World!" );
	     ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
	     
	     Student student2=(Student) context.getBean("student2");
	     System.out.println(student2);
	    
	     
//	     new bean
	     Student student3=(Student) context.getBean("student3");
       System.out.println(student3);
	}
}
