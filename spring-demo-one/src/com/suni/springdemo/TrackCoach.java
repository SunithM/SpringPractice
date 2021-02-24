package com.suni.springdemo;

public class TrackCoach implements Coach {
	private FortuneService fortuneService;
	public void setFortuneService(FortuneService theFortuneService) {
		this.fortuneService = theFortuneService;
	}

	
	
	public TrackCoach() {
		System.out.println("Track coach : Inside defualt contructor");
	}
//	public TrackCoach(FortuneService theFortuneService) {
//		super();
//		this.theFortuneService = theFortuneService;
//	}

	@Override
	public String getDailyWorkout() {
		
		return "Run hard 5K";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
		
	}
	
	//add init method
	public void doMyStartupStuff() {
		System.out.println("TrackCoach : inside method doMyStartUpStuff");
	}
	
	//add destroy method
	public void doMyCleanUpStuffYo(){
		System.out.println("TrackCoach : inside method doMyCleanupStuffYo");
	}

}
