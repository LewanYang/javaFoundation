package com.imooc.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class CatTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cat cat1 = new Cat("����",12,"Ӣ����ëè");
		Cat cat2 = new Cat("����",3,"�л���԰è");
		
		//���Ϸ��еķ�����ʹ��setֻ�ܼ�ĳ������
		Set<Cat> set = new HashSet<Cat>();
		set.add(cat1);
		set.add(cat2);
		
		Iterator<Cat> it = set.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		//����
		if(set.contains(cat1)) {
			System.out.println("�����ҵ���");
		}else {
			System.out.println("����û�ҵ�");
		}
		
		//�ڼ�����ʹ�����ֲ��һ�������Ϣ
		System.out.println("=================================");
		System.out.println("ͨ�����ֲ��һ�����Ϣ");
		boolean flag = false;
		Cat c=null;
		it=set.iterator();
		while(it.hasNext()) {
			c=it.next();
			if(c.getName().equals("����"));
			flag=true;
			break;
		}
		
		if(flag) {
			System.out.println("�����ҵ���");
			System.out.println(c);
		}else {
			System.out.println("����û�ҵ�");
		}
		
		
		System.out.println("==============================");
		//ʹ����ǿforѭ�����У�
		for(Cat item:set) {
			if("����".equals(item.getName())) {
				set.remove(item);
			}
		}
		
		for(Cat cat:set) {
			System.out.println(cat);
		}

	}
}
