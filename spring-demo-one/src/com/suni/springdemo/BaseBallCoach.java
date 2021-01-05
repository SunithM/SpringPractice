package com.suni.springdemo;

public class BaseBallCoach implements Coach {
	//define private field for the dependency
	private FortuneService fortuneService;
	
	//define constructor for dependency injection
	public BaseBallCoach(FortuneService theFortuneSrvice) {
		fortuneService=theFortuneSrvice;
	}
	
	
	public String getDailyWorkout(){
		return "Spend 30 min on batting practice";
		
	}

	@Override
	public String getDailyFortune() {
		//use my fortuneServices to get a fortune
		return fortuneService.getFortune();
	}

}
