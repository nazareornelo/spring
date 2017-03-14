package com.spring.annotation.demo;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {
	
	private String[] data = { "This is the first location","This is the second location","This is the third location"};
	
	private Random myRandom = new Random();

	public String getFortune() {
		// TODO Auto-generated method stub
		
		int index = myRandom.nextInt(data.length);
		
		String theFortune = data[index];
		
		return theFortune;
	}

}
