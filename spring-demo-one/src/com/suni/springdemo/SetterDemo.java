package com.suni.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemo {

	public static void main(String[] args) {
		
		//load the spring configuration file
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//retrieve bean from spring container
		CricketCoach theCricketCoach= context.getBean("myMricketCoach",CricketCoach.class);
		//call methods on bean
		System.out.println(theCricketCoach.getDailyWorkout());
		System.out.println(theCricketCoach.getDailyFortune());
		//close the context
		System.out.println(theCricketCoach.getEmail());
		System.out.println(theCricketCoach.getTeamName());
		context.close();

}

}
