package com.imooc.generic;


/**
 * �Զ��巺����
 * �о����Զ��弯��
 * @author 32783
 *
 */
public class NumGeneric<T>{
	private T num;
	public T getNum() {
		return num;
	}
	public void setNum(T num) {
		this.num = num;
	}
	
	//����
	public static void main(String[] args) {
		//�ͺ�ʹ��ArrayListһ��
		NumGeneric<Integer> intNum = new NumGeneric<Integer>();
		intNum.setNum(10);
		System.out.println("Integer:"+intNum.getNum());
	}
}
