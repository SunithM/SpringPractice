package com.suni.springdemo;

import org.springframework.stereotype.Component;

@Component("baseBallCoachBean")
public class BaseballCoach implements Coach {

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Pratice right throw";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return null;
	}

}
