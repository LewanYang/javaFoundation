package com.imooc.stringdemo;

public class StringBuilderDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//
		StringBuilder str = new StringBuilder("你好");
		//在'你好'后面添加内容,将字符串变成“你好，imooc”
		str.append(",");
		str.append("imooc");
		System.out.println("str="+str);
	}
}
