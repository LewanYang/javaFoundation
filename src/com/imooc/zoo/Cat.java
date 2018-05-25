package com.imooc.zoo;

public class Cat extends Animal {

	private double weight; //体重
	
	public static int st3 = 44;
	//构造函数
	public Cat() {
		
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	//跑动的方法
	public void run() {
		System.out.println(this.getName()+"是一只"+this.getSpecies()+"，它在快乐的奔跑");
	}
	
	@Override // override的意思是标识下方的方法是方法重写； 它是个注解； 
	public void eat() {
		// TODO Auto-generated method stub
		super.eat();
	}
	
}
