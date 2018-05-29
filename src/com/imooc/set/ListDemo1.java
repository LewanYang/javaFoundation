package com.imooc.set;

import java.util.ArrayList;
import java.util.List;

public class ListDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List list = new ArrayList();
		list.add("Java");
		list.add("C");
		list.add("C++");
		list.add("Go");
		list.add("swift");
		
		//输出列表中元素的个数
		System.out.println("列表中元素的个数为："+list.size());
		System.out.println("=========================");
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i)+",");
		}
		
		System.out.println("========================");
		//移除列表里的C++
		list.remove("C++");
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i)+",");
		}
	}

}
