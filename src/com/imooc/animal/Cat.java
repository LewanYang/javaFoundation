package com.imooc.animal;

public class Cat {
	//属性
	String name;
	int month;
	double weight;
	String species;
	//方法
	public void run() {
		System.out.println("小猫会跑");
	}
	
	public void eat() {
		System.out.println("小猫吃鱼");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public String getSpecies() {
		return species;
	}

	public void setSpecies(String species) {
		this.species = species;
	}
	
	public Cat() {
		System.out.println("这是一只加菲猫");
	}
	
	public Cat(String n) {
		System.out.println("输出刚才打印的"+n);
	}
	
}
