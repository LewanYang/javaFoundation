package com.imooc.auto;

public final class HomeCar extends Car {
	private int num; // �ؿ���

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public HomeCar(String color, String userName, int num) {
		super(color, userName);
		this.num = num;
	}

	public HomeCar() {

	}

	public void display() {
		System.out.println(this.getUserName() + "ӵ�е�" + this.getColor() + "��ɫ��˽�ҳ���" + this.getNum()+"��λ");
	}
	
	//��������
	public void display(int num) {
		System.out.println("�������������"+num+"��λ");
	}
}
