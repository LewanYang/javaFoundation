package com.imooc.zoo;

public class Animal {
	private String name;
	private int month;
	private String species;
	
	// ��̬��Ա����
	private static int st1 = 22;
	private static int st2 = 23;

	static {
		System.out.println("���Ǹ���ľ�̬�����");
	}
	
	{
		System.out.println("���Ǹ���Ĺ�������");
	}
	
	//�޲ι���
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
		System.out.println("����Զ���");
	}
	
	public boolean equals(Object obj) {
		if(obj == null) {
			return false;
		}
		Animal temp = (Animal)obj; //��������͵�ת����
		if((this.getName().equals(temp.getName()))&&(this.getMonth()==temp.getMonth())) {
			return true;
		}else {
			return false;
		}
	}
}
