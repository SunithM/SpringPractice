package com.suni.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("ApplicationContextTest.xml");
		CricketCoach test=context.getBean("myCricketCoach",CricketCoach.class);
		System.out.println(test.getDailyFortune());
		
		context.close();
	}

}
