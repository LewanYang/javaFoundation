package com.imooc.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class WordDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ��Ӣ�ĵ�����ӵ�HashSet��
		Set set = new HashSet();
		//�򼯺������Ԫ��
		set.add("blue");
		set.add("orange");
		set.add("yellow");
		set.add("white");
		set.add("black");
		
		//��ʾ��ϵ�����
		System.out.println("ʹ�õ�����Iterator����������");
		Iterator it = set.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
