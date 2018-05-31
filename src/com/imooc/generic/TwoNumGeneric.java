package com.imooc.generic;

public class TwoNumGeneric<T,X>{
	private T num1;
	private X num2;
	
	//自定义方法
	public void getNum(T num1,X num2) {
		this.num1 = num1;
		this.num2 = num2;
	}
	
	public T getNum1() {
		return num1;
	}
	public void setNum1(T num1) {
		this.num1 = num1;
	}
	public X getNum2() {
		return num2;
	}
	public void setNum2(X num2) {
		this.num2 = num2;
	}
}
