package com.spring.annotation.demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {

	public static void main(String[] args) {
		// read spring config file
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("annotation-applicationContext.xml");
		
		// get the bean from the spring container
		
		// Coach theCoach = context.getBean("thatSillyCoach",Coach.class);
		TennisCoach theCoach = context.getBean("tennisCoach",TennisCoach.class);
		
		// call a method on the bean
		
		System.out.println(theCoach.getDailyWorkout());
		
		System.out.println(theCoach.getDailyFortune());
		
		System.out.println(theCoach.getEmail());
		
		System.out.println(theCoach.getTeam());
		

	    // close the context
		
		context.close();
	
	}

}
