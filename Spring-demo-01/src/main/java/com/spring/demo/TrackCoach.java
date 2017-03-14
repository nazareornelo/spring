package com.spring.demo;

public class TrackCoach implements Coach {
	
	private FortuneService fortuneService;

	
	public TrackCoach(FortuneService fortuneService) {
		super();
		this.fortuneService = fortuneService;
	}
	
	
  
	public TrackCoach() {
		super();
	}



	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "First Spring application from TrackCoach";
	}

	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return "Just do it " + fortuneService.getFortune();
	}
	
	//init method
	public void doMyStartupStuff() {		
		System.out.println("TrackCoach: inside method doMyStartupStuff");
	}

	// Destroy methods
	public void doMyCleanupStuff() {		
		System.out.println("TrackCoach: inside method doMyCleanupStuff");
	}
}
