package com.imooc.signleton;

public class Test {
	public static void main(String[] args) {
		SingletonOne one = SingletonOne.getInstance();
		SingletonOne two = SingletonOne.getInstance();
		
		if(one == two) {
			System.out.println("one��two����ȵ�");
		}
	}
}
