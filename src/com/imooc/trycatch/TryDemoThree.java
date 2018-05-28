package com.imooc.trycatch;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryDemoThree {
	public static void main(String[] args) {
		try {
			int result = test();
			System.out.println("one和two的商是："+result);
		}catch(ArithmeticException e) {
			
		}catch(InputMismatchException e) {
			
		}catch(Exception e) {
			
		}
		
		abc();
	}
	
	public static int test() throws Exception{
		Scanner input = new Scanner(System.in);
		
		System.out.println("=====运算开始=======");
		System.out.print("请输入第一个数字");
		int one = input.nextInt();
		System.out.print("请输入第二个数字");
		int two = input.nextInt();
		System.out.println("======运算结果======");
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
		
		System.out.println("=====运算开始=======");
		System.out.print("请输入第一个数字");
		int one = input.nextInt();
		System.out.print("请输入第二个数字");
		int two = input.nextInt();
		System.out.println("======运算结果======");
		return one/two;
	}
}
