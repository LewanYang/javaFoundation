package com.imooc.animal;

public class Cat {
	// ����
	String name;
	int month;
	double weight;
	String species;

	// ���췽��
	public Cat(String name, int month, double weight, String species) {
		this.name = name;
		this.month = month;
		this.weight = weight;
		this.species = species;
	}

	// ����
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
		if (month <= 0) {
			System.out.println("������Ϣ���󣬳���è�����䲻��С��0");
		} else {
			this.month = month;
		}
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
		System.out.println("����ղŴ�ӡ��" + n);
	}

}
