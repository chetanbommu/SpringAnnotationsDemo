package com.luv2code.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {

	//Field Injection
	/*@Autowired
	@Qualifier("databaseFortuneService")
	*/
	private FortuneService fortuneService;
	
	@Override
	public String getDailyWorkout() {
		return "Practice backhand volley";
	}
	
	//Constructor Injection
	/*
 	@Autowired
 	public TennisCoach(@Qualifier("databaseFortuneService") FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}*/

	//Setter Injection
	@Autowired
	@Qualifier("databaseFortuneService")
	public void setFortuneService(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
	
	//AnyMethod Injection
	/*@Autowired
	public void injectFortuneService(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}*/
	
	
	
	@Override
	public String getDailyFortune() {
		return fortuneService.getDailyFortune();
	}

}
