package com.imooc.zoo;

public class Cat extends Animal {

	private double weight; //����
	
	//���캯��
	public Cat() {
		
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	//�ܶ��ķ���
	public void run() {
		System.out.println(this.getName()+"��һֻ"+this.getSpecies()+"�����ڿ��ֵı���");
	}
	
	
}
