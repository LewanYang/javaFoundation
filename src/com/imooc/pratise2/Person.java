package com.imooc.pratise2;

public class Person {
	private String name;
	private String sex;
	private int age;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	//带参构造
	public Person(String name,int age,String sex) {
		this.setName(name);
		this.setAge(age);
		this.setSex(sex);
	}
	
	//重写toString 方法
	public String toString() {
		String str = "姓名："+this.getName()+" 性别："+this.getSex()+" 性别："+this.getSex();
		return str;
	}
}
