package com.suni.springdemo;

import org.springframework.beans.factory.annotation.Value;

public class SwimCoach implements Coach {
	@Value("${foo.email}")
	String email;
	
	@Value("${foo.team}")
	String team;
	FortuneService fortuneService;
	public SwimCoach(FortuneService theFortuneService) {
		 fortuneService = theFortuneService;
		 System.out.println(">>Inside swime coach constructor");
	}
	@Override
	public String getDailyWorkout() {
		return "Swim 1000 meter for warmup";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}
	public String getEmail() {
		return email;
	}
	public String getTeam() {
		return team;
	}

}
