package com.faithinfotech.springdemo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SamplePlans {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		Chitty theChitty;
		
		//load the spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		// retrieve bean from spring container
		System.out.print("1.ShortTermChitty, 2.LongTermChitty");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int choice = Integer.parseInt(br.readLine());
		switch(choice) {
		case 1: theChitty = context.getBean("shortTermChitty",Chitty.class);
			
		
				//call methods on the bean
				System.out.println(theChitty.monthlyCollection());
				System.out.println(theChitty.getMonthlyDepression());
				//close the context
				context.close();
				break;
		case 2:LongTermChitty theChittyy= context.getBean("longTermChitty",LongTermChitty.class);
				//call methods on the bean
	
				System.out.println(theChittyy.monthlyCollection());
				System.out.println(theChittyy.getMonthlyDepression());
				System.out.println(theChittyy.getCusname());
				System.out.println(theChittyy.getBranch());
			
//				//close the context1
				context.close();
				break;

				

		}
		
	}

}
