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
		
		//����б���Ԫ�صĸ���
		System.out.println("�б���Ԫ�صĸ���Ϊ��"+list.size());
		System.out.println("=========================");
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i)+",");
		}
		System.out.println("========================");
		//�Ƴ��б����C++
		list.remove("C++");
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i)+",");
		}
	}

}
