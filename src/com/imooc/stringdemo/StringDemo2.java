package com.imooc.stringdemo;

public class StringDemo2 {
	public static void main(String[] args) {
		//定义一个字符串;
		String str = new String("JAVA 周杰伦 利物浦");
		//将字符串转换成byte数组
		byte[] arrs = str.getBytes();
		for(int i=0;i<arrs.length;i++) {
			System.out.print(arrs[i]+" ");
		}
		
		System.out.println();
		//将byte数组在转换成字符串
		String str1 = new String(arrs);
		System.out.print(str1);
		
	}
}
