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
	
	//���ι���
	public Person(String name,int age,String sex) {
		this.setName(name);
		this.setAge(age);
		this.setSex(sex);
	}
	
	//��дtoString ����
	public String toString() {
		String str = "������"+this.getName()+" �Ա�"+this.getSex()+" �Ա�"+this.getSex();
		return str;
	}
}
