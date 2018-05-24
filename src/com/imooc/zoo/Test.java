package com.imooc.zoo;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cat one = new Cat();
		one.setName("花花");
		one.setSpecies("中华田园猫");
		one.eat();
		one.run();
		System.out.println("=======================");
		Dog two = new Dog();
		two.setName("牛牛");
		two.setMonth(1);
		two.eat();
		two.sleep();
	}

}
