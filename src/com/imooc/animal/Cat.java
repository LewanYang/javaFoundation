package com.imooc.animal;

public class Cat {
	//����
	String name;
	int month;
	double weight;
	String species;
	//����
	public void run() {
		System.out.println("Сè����");
	}
	
	public void eat() {
		System.out.println("Сè����");
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
		System.out.println("����һֻ�ӷ�è");
	}
	
	public Cat(String n) {
		System.out.println("����ղŴ�ӡ��"+n);
	}
	
}
