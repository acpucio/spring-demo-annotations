package com.luv2code.springdemo;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {

	// create an array of strings
	private String[] data = {
			"Beware of the wolf in sheep's coding",
			"Diligence is the mother of good luck",
			"The Journey is the reward"
	};
	
	// create a randome number genearator
	private Random myRandom = new Random();
	
	
	@Override
	public String getFortune() {
		// Pick a random string from the array
		int index = myRandom.nextInt(data.length);

		String theFortune = data[index];
		
		return theFortune;
	}

}
