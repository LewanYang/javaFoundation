package com.imooc.zoo;

public class Animal {
	private String name;
	private int month;
	private String species;
	
	// 静态成员属性
	private static int st1 = 22;
	private static int st2 = 23;

	static {
		System.out.println("我是父类的静态代码块");
	}
	
	{
		System.out.println("我是父类的构造代码块");
	}
	
	//无参构造
	public Animal() {
		
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

	public String getSpecies() {
		return species;
	}

	public void setSpecies(String species) {
		this.species = species;
	}
	
	public void eat() {
		System.out.println("动物吃东西");
	}
	
	public boolean equals(Object obj) {
		if(obj == null) {
			return false;
		}
		Animal temp = (Animal)obj; //这个是类型的转换；
		if((this.getName().equals(temp.getName()))&&(this.getMonth()==temp.getMonth())) {
			return true;
		}else {
			return false;
		}
	}
}
