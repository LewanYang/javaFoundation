package com.imooc.trycatch;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryDemoOne {
	public static void main(String[] args) {
		// Ҫ�󣺶��������������������֮��
//		int one = 12;
//		int two = 2;
//		System.out.println("one��two���̣�"+(one/two));
		
		// Ҫ�󣬶������������������û��ļ������룬�������֮��
//		Scanner input = new Scanner(System.in);
//		try {
//			System.out.println("======���㿪ʼ======");
//			System.out.print("�������һ��������");
//			int one = input.nextInt();
//			System.out.print("������ڶ���������");
//			int two = input.nextInt();
//			System.out.println("one��two�����ǣ�"+(one/two));
//		}catch(ArithmeticException e) {
//			System.out.println("����������Ϊ��");
//			e.printStackTrace();
//		}catch(InputMismatchException e) {
//			System.out.println("����������");
//			e.printStackTrace();
//		}catch(Exception e) {  //������޷�ȷ�������������ʱ����Exception
//			System.out.println("������");
//			e.printStackTrace();
//		}finally {
//			System.out.println("=====�������=====");
//		}
		int result = test(5,7);
		System.out.println(result);
	}
	
	public static int test(int one, int two) {
		if(one>two) {
			return one;
		}else {
			return two;
		}
	}
}
