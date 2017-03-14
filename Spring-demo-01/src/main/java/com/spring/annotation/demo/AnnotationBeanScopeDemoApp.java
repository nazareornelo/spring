package com.spring.annotation.demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanScopeDemoApp {

	public static void main(String[] args) {
		// read spring config file
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("annotation-applicationContext.xml");
		
		// get the bean from the spring container
		
		// Coach theCoach = context.getBean("thatSillyCoach",Coach.class);
		TennisCoach theCoach = context.getBean("tennisCoach",TennisCoach.class);
		
		TennisCoach alphaCoach = context.getBean("tennisCoach",TennisCoach.class);
		
		// call a method on the bean
		
		boolean result = (theCoach == alphaCoach);
		
		System.out.println("\n Pointing to the same object: " + result);
		
		System.out.println("\n Memory location for theCoach: " + theCoach);
		
		System.out.println("\n Memory location for alphaCoach " + alphaCoach);
		

	    // close the context
		
		context.close();
	}

}
