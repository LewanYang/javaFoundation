package com.imooc.zoo;

public class Cat extends Animal {

	private double weight; //����
	
	public static int st3 = 44;
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
	
	@Override // override����˼�Ǳ�ʶ�·��ķ����Ƿ�����д�� ���Ǹ�ע�⣻ 
	public void eat() {
		// TODO Auto-generated method stub
		super.eat();
	}
	
}
