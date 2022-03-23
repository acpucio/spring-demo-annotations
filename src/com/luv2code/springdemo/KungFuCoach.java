package com.luv2code.springdemo;

import org.springframework.stereotype.Component;

@Component
public class KungFuCoach implements Coach {

	private FortuneService fortuneService;
	
	@Override
	public String getDailyWorkout() {

		return "Practice your Dragon Tornado Kicks";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune() ;
	}

}
