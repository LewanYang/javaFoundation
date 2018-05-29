package com.imooc.stringdemo;

public class StringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "abcdefg";
		String str2 = str.substring(2, 5).toUpperCase();
		System.out.println(str);
		System.out.println(str2);
		String str3 = str2.replace("DE", "MM");
		System.out.println(str3);
	}

}
