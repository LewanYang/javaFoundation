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
		
		//改成iMOOC\
		//方法一：
		System.out.println("替换后："+str.delete(4, 8).insert(4, "MOOC"));
		//方法二：
		System.out.println(str.replace(4, 8, "MOOC"));
		
		//在字符串中'你好，iMOOC'中取出'你好'并输出
		System.out.println(str.substring(0,2));
		
	}
}
