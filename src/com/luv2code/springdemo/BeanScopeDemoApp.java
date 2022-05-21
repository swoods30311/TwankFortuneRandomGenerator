package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {

	public static void main(String[] args) {

		// load the spring configuration file
		ClassPathXmlApplicationContext context =
				new ClassPathXmlApplicationContext("beanScopeBasketBallCoach-applicationContext.xml");
				
		// retrieve bean from spring container
		//Singleton Config when the scope is Singleton or unlabeled 
		Coach theCoach = context.getBean("nateMcMillan", Coach.class);

		Coach alphaCoach = context.getBean("nateMcMillan", Coach.class);
		
		// check if they are the same
		boolean result = (theCoach == alphaCoach);
		
		// print out the results
		System.out.println("\nPointing to the same object: " + result);
		
		System.out.println("\nMemory location for theCoach: " + theCoach);

		System.out.println("\nMemory location for alphaCoach: " + alphaCoach + "\n");
	
		// close the context
		context.close();
	}

}








