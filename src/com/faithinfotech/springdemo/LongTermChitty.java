package com.faithinfotech.springdemo;

public class LongTermChitty implements Chitty {
	
	
	private String cusname;
	private String branch;
	private Depression depression;
	
	public String getCusname() {
		return cusname;
	}
	public void setCusname(String cusname) {
		System.out.println("Inside setter method setCusname");
		this.cusname = cusname;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		System.out.println("Inside setter method in branch");
		this.branch = branch;
	}
	
	public LongTermChitty() {
		System.out.println("Inside LongTerm Chitty constructor");
	}
	
	
	public Depression getDepression() {
		return depression;
	}
	public void setDepression(Depression depression) {
		this.depression = depression;
	}
	@Override
	public String monthlyCollection() {
		// TODO Auto-generated method stub
		return "Give 40000 monthly installment for 100 months";
	}
	@Override
	public String getMonthlyDepression() {
		// TODO Auto-generated method stub
		return depression.getDepression();
	}


}
