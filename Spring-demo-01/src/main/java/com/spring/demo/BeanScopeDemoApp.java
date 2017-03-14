package com.spring.demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("lifecycle-beanScope-applicationContext.xml");
		
		Coach theCoach = context.getBean("myCoach", Coach.class);
		
		Coach alphaCoach = context.getBean("myCoach", Coach.class);
		
		boolean result = (theCoach == alphaCoach);
		
		System.out.println("\n Pointing to the same object " + result);
		
		System.out.println("\n Memory location for the theCoach: " + theCoach);
		
		System.out.println("\n Memory location for the alphaCoach: " + alphaCoach + "\n");
		
		context.close();

	}

}
