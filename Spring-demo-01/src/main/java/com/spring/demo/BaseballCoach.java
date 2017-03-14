package com.spring.demo;

public class BaseballCoach implements Coach {


	private FortuneService fortuneService;
	
	public BaseballCoach(FortuneService theFortuneService){
		
		fortuneService = theFortuneService;
	}
	
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Spend 30 minutes on batting practice";
	}

	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}
	
	
}
