package com.luv2code.spring.demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {

	public static void main(String[] args) {

		// load the spring config file

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"beanScope - applicationContext.xml");
		// retrieve beans from spring container
		Coach theCoach = context.getBean("myCoach", Coach.class);
		Coach alphaCoach = context.getBean("myCoach", Coach.class);
		
		//check if this are same bean
		boolean result = (theCoach == alphaCoach);
		//print the result
		System.out.println("\nPointing to the same object : " + result);
		System.out.println("\nMemory location for aplhaCoach " + alphaCoach + "\n" );
		
		//close the context
		context.close();
	}

}
