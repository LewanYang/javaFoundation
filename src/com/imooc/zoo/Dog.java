package com.imooc.zoo;

public class Dog extends Animal {
	private String sex; // �Ա�
	
	public Dog() {
		
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}
	
	//˯���ķ�����
	public void sleep() {
		System.out.println(this.getName()+"����"+this.getMonth()+"���´�����˯��");
	}
	
	//������д����ķ���
	public void eat() {
		System.out.println(this.getName()+"����û��ʳ��");
	}
}
