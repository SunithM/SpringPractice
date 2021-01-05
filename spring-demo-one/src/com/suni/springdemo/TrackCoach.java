package com.suni.springdemo;

public class TrackCoach implements Coach {
	private FortuneService theFortuneService;
	
	
	public TrackCoach(FortuneService theFortuneService) {
		super();
		this.theFortuneService = theFortuneService;
	}

	@Override
	public String getDailyWorkout() {
		
		return "Run hard 5K";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return theFortuneService.getFortune();
	}

}
