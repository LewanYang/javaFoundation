package com.imooc.zoo;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cat one = new Cat();
		one.setName("����");
		one.setSpecies("�л���԰è");
		one.eat();
		one.run();
		System.out.println("=======================");
		Dog two = new Dog();
		two.setName("ţţ");
		two.setMonth(1);
		two.eat();
		two.sleep();
		/**
		 * toString����
		 */
		System.out.println(one.toString());
		System.out.println(one);
	}
}
