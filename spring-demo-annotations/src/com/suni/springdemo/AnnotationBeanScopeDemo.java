package com.suni.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanScopeDemo {

	public static void main(String[] args) {
		// Load spring config file
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//Retrieve bean from spring container
		Coach theCoach=context.getBean("tennisCoach",Coach.class);
		
		Coach alphaCoach=context.getBean("tennisCoach",Coach.class);
		//check if they are same
		boolean result=(theCoach==alphaCoach);
		System.out.println("Is both the object are same :"+result);
		System.out.println(theCoach.getDailyFortune());
		System.out.println("theCoach:"+theCoach);
		System.out.println("alphaCoach: "+alphaCoach);
		//close context
		context.close();

	}

}
