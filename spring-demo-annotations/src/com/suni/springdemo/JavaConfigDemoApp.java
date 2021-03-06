package com.suni.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class JavaConfigDemoApp {

	public static void main(String[] args) {
		// read spring java config file
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportsConfig.class);

		// get the bean from spring container
		Coach theCoach = context.getBean("tennisCoach", Coach.class);
		//Coach theCoach2=context.getBean("baseBallCoachBean",Coach.class);
		// call a method on a bean
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(theCoach.getDailyFortune());
		// close the context
		context.close();
	}

}
