package com.suni.springdemo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("singleton")
public class TennisCoach implements Coach {

	@Autowired
	@Qualifier("happyFortuneService")
	private FortuneService fortuneService;

	public TennisCoach() {
		System.out.println(">>Tennis Coach: Inside default constructor");
	}

	@PostConstruct
	public void doMyStartupStuff() {
		System.out.println(">>TennisCoach inside of doMyStartupStuff");
	}

	@PreDestroy
	public void doMyCleanUpStuff() {
		System.out.println(">>TennisCoach inside of doMyCleanUpStuff");
	}

	// Define setter method
//	@Autowired
//	public void doMyTest(FortuneService theFortuneService) {
//		System.out.println(">>Tennis Coach: Inside doMyTest method");
//		fortuneService=theFortuneService;
//		
//	}
	/*
	 * @Autowired public void doSomeCrazyStuff(FortuneService theFortuneService) {
	 * System.out.println(">>Inside doSomeCrazyStuff");
	 * fortuneService=theFortuneService; }
	 */
	@Override
	public String getDailyWorkout() {
		return "Practice your backhand volley";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

	/*
	@Autowired
	public TennisCoach(FortuneService fortuneService) {
		super();
		this.fortuneService = fortuneService;
	}
	 */
}
