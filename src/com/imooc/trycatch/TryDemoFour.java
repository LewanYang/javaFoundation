package com.imooc.trycatch;

import java.util.Scanner;

public class TryDemoFour {
	public static void main(String[] args) {
		
	}
	
	public static void testAge() {
		System.out.println("请输入你的年龄：");
		Scanner input = new Scanner(System.in);
		int age = input.nextInt();
		if(age<18 || age>80) {
			
		}else {
			System.out.println("欢迎入住酒店");
		}
	}
}
