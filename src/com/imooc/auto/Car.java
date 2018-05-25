package com.imooc.auto;

public class Car {
	private String color;
	private String userName;
	
	/**
	 * getter && setter
	 * @return
	 */
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	/**
	 * 带参构造函数
	 */
	public Car(String color, String userName) {
		this.setColor(color);
		this.setUserName(userName);
	}
	/**
	 * 无参构造函数
	 */
	public Car() {
		
	}
	
	public void use() {
		System.out.println("我是机动车");
	}
	
	public boolean equals() {
		if((this.color==null)||(this.userName==null)) {
			return false;
		}
		if(this.color == this.userName) {
			return true;
		}else {
			return false;
		}
	}

	
}
