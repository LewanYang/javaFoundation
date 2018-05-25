package com.imooc.auto;

public class Taxi extends Car{
	private String company;

	public Taxi(String color, String userName, String company) {
		super(color, userName);
		this.company = company;
	}
	
	public final void ride() {
		System.out.println(this.getUserName()+"���⳵��������"+this.getCompany()+"��˾");
	}

	//getter && setter
	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}
	
	
}
