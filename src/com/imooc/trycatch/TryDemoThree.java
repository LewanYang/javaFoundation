package com.imooc.trycatch;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryDemoThree {
	public static void main(String[] args) {
		try {
			int result = test();
			System.out.println("one��two�����ǣ�"+result);
		}catch(ArithmeticException e) {
			
		}catch(InputMismatchException e) {
			
		}catch(Exception e) {
			
		}
		
		abc();
	}
	
	public static int test() throws Exception{
		Scanner input = new Scanner(System.in);
		
		System.out.println("=====���㿪ʼ=======");
		System.out.print("�������һ������");
		int one = input.nextInt();
		System.out.print("������ڶ�������");
		int two = input.nextInt();
		System.out.println("======������======");
		return one/two;
	}
	
	/**
	 * 
	 * @return
	 * @throws ArithmeticException
	 * @throws InputMismatchException
	 */
	public static int abc() throws ArithmeticException,InputMismatchException{
		Scanner input = new Scanner(System.in);
		
		System.out.println("=====���㿪ʼ=======");
		System.out.print("�������һ������");
		int one = input.nextInt();
		System.out.print("������ڶ�������");
		int two = input.nextInt();
		System.out.println("======������======");
		return one/two;
	}
}
