package com.luv2code.spring.demo;

public class CricketCoach implements Coach {

	// adding new fields for email address and team
	private String emailAddress;
	private String team;

	private FortuneService fortuneService;

	public CricketCoach() {
		System.out.println("CricketCoach: inside no arg constructor");
	}

	public void setEmailAddress(String emailAddress) {
		System.out.println("CricketCoach: inside setter method for email address");
		;
		this.emailAddress = emailAddress;
	}

	public void setTeam(String team) {
		System.out.println("CricketCoach: inside setter method for team");
		this.team = team;
	}

	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("CricketCoach: inside setter method for fotune service");
		this.fortuneService = fortuneService;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public String getTeam() {
		return team;
	}

	@Override
	public String getDailyWorkout() {
		return "Practice fast bowling for 15 minutes";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
