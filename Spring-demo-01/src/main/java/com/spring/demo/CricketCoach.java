package com.spring.demo;

public class CricketCoach implements Coach {

	
	private FortuneService fortuneService;
	private String emailAddress;
	private String team;
	
	
	
	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAdddress) {
		System.out.println("CricketCoach: inside setter method -set EmailAddress");
		this.emailAddress = emailAdddress;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		System.out.println("CricketCoach: inside setter method -set team");
		this.team = team;
	}

	public CricketCoach() {
		
		System.out.println("CriCoach: inside no-arg Constructor");
	}
	
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Practice fast bowling";
	}



	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("CricketCoach: inside setter method -set FortuneService");
		this.fortuneService = fortuneService;
	}

	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}

}
