package com.imooc.auto;

public final class HomeCar extends Car {
	private int num; // 载客数

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public HomeCar(String color, String userName, int num) {
		super(color, userName);
		this.num = num;
	}

	public HomeCar() {

	}

	public void display() {
		System.out.println(this.getUserName() + "拥有的" + this.getColor() + "颜色的私家车有" + this.getNum()+"座位");
	}
	
	//方法重载
	public void display(int num) {
		System.out.println("家用汽车大多有"+num+"座位");
	}
}
