package com.suni.springdemo;

public class CricketCoach implements Coach{
	//define private field for the dependency
	private FortuneService fortuneService;
	private String teamName;
	private String email;
	
	public String getTeamName() {
		return teamName;
	}

	public void setTeamName(String teamName) {
		System.out.println("CricketCoach:Inside setter method-setTeamName");
		this.teamName = teamName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		System.out.println("CricketCoach:Inside setter method-setEmail");
		this.email = email;
	}

	public CricketCoach() {
		System.out.println("CricketCoach:No argument constructor");
	}
	
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("CricketCoach:Inside setter method");
		this.fortuneService = fortuneService;
	}

	public String getDailyWorkout(){
		return "Spend 30 min catch practice";
		
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}
	

}
