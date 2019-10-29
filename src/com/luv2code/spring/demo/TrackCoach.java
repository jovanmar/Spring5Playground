package com.luv2code.spring.demo;

public class TrackCoach implements Coach {
	
	private FortuneService fortuneService;
	

	public TrackCoach(FortuneService fortuneService) {
		super();
		this.fortuneService = fortuneService;
	}

	public TrackCoach() {
		super();
	}

	@Override
	public String getDailyWorkout() {
		return "Run a hard 5k";
	}

	@Override
	public String getDailyFortune() {
		return "Just do it" + fortuneService.getFortune();
	}

}
