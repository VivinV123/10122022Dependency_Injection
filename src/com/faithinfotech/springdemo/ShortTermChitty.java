package com.faithinfotech.springdemo;

public class ShortTermChitty implements Chitty {
	
	private Depression depression;
	
	public ShortTermChitty(Depression theDepression) {
		
		depression = theDepression;
	}

	@Override
	public String monthlyCollection() {
		// TODO Auto-generated method stub
		return "2000 for 20 month";
	}

	@Override
	public String getMonthlyDepression() {
		// TODO Auto-generated method stub
		return "No depression as much as long term chitty";
	}
	
//	@Override
//	public String getDailyWorkout() {
//		
//		
//		return"Spend 30 minutes on batting practice";
//	}
//
//	@Override
//	public String getDailyFortune() {
//		return fortuneService.getFortune();
//		
//	}

}
