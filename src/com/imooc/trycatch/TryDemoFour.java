package com.imooc.trycatch;

import java.util.Scanner;

public class TryDemoFour {
	public static void main(String[] args) {
		try {
			testAge();
		} catch (HotelAgeException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
			System.out.println("......");
		}
	}
	// 描述酒店的入住规则，限定年龄，18岁以下，80岁以上的住客必须由亲友陪同
	/*public static void testAge() {
		// 自己抛出的异常，自己去处理，try catch
		try {
			System.out.println("请输入你的年龄：");
			Scanner input = new Scanner(System.in);
			int age = input.nextInt();
			if (age < 18 || age > 80) {
				throw new Exception("18岁以下，80岁以上的住客必须由亲友陪同");
			} else {
				System.out.println("欢迎入住酒店");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}*/
	
	public static void testAge() throws HotelAgeException {
		System.out.println("请输入你的年龄：");
		Scanner input = new Scanner(System.in);
		int age = input.nextInt();
		if (age < 18 || age > 80) {
			throw new HotelAgeException();
		} else {
			System.out.println("欢迎入住酒店");
		}
	}
}
