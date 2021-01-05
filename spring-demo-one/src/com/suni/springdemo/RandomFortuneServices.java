package com.suni.springdemo;

import java.util.Random;

public class RandomFortuneServices implements FortuneService {
	String[] fortune= {"Beware of the wolf in sheep's clothing",
			"Diligence is the mother of good luck",
			"The journey is the reward","Better day!","Hard day"};
	@Override
	public String getFortune() {
		int rnd = new Random().nextInt(fortune.length);
	    return fortune[rnd];

	}

}
