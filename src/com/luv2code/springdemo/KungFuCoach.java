package com.luv2code.springdemo;

import org.springframework.stereotype.Component;

@Component
public class KungFuCoach implements Coach {

	@Override
	public String getDailyWorkout() {

		return "Practice your Dragon Tornado Kicks";
	}

}
