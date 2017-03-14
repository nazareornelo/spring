package com.spring.annotation.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

//@Component("thatSillyCoach")
@Component
//@Scope("prototype")
public class TennisCoach implements Coach {
	// @Autowired
	// @Qualifier("randomFortuneService")
	private FortuneService fortuneService;
	
	@Value("${foo.email}")
	private String email;
	@Value("${foo.team}")
	private String team;
	
	public String getEmail() {
		return email;
	}

	public String getTeam() {
		return team;
	}


	public TennisCoach() {

		System.out.println(">> TennisCoach: inside default constructor");
	}

	@Autowired
	public TennisCoach(@Qualifier("randomFortuneService") FortuneService theFortuneService) {
		System.out.println(">> TennisCoach: inside default constructor Qualifier");
		fortuneService = theFortuneService;
	}

	public String getDailyWorkout() {

		return "Practice your backhand volley";
	}
	/*
	 * @Autowired public void setFortuneService(FortuneService fortuneService) {
	 * System.out.
	 * println(">> TennisCoach: inside default setter method - FortuneService");
	 * this.fortuneService = fortuneService; }
	 */

	/*
	 * @Autowired public void doSetFortuneService(FortuneService fortuneService)
	 * { System.out.
	 * println(">> TennisCoach: inside default setter method - doSetFortuneService"
	 * ); this.fortuneService = fortuneService; }
	 */

	public String getDailyFortune() {

		return fortuneService.getFortune();
	}
	
	// define my init method
	
	
    @PostConstruct
	public void doMyStartupStuff(){
		
		System.out.println(">> TennisCoach : inside of doMyStartupStuff()");
	}
	
	// define my destroy method
    @PreDestroy
	public void doMyCleanupStuff(){
		
		System.out.println(">> TennisCoach : inside of doMyCleanupStuff()");
	}	

  
}
