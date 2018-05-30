package com.imooc.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class CatTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cat cat1 = new Cat("花花",12,"英国短毛猫");
		Cat cat2 = new Cat("帆帆",3,"中华田园猫");
		
		//加上泛行的方法，使得set只能加某种类型
		Set<Cat> set = new HashSet<Cat>();
		set.add(cat1);
		set.add(cat2);
		
		Iterator<Cat> it = set.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		//查找
		if(set.contains(cat1)) {
			System.out.println("花花找到了");
		}else {
			System.out.println("花花没找到");
		}
		
		//在集合中使用名字查找花花的信息
		System.out.println("=================================");
		System.out.println("通过名字查找花花信息");
		boolean flag = false;
		Cat c=null;
		it=set.iterator();
		while(it.hasNext()) {
			c=it.next();
			if(c.getName().equals("花花"));
			flag=true;
			break;
		}
		
		if(flag) {
			System.out.println("花花找到了");
			System.out.println(c);
		}else {
			System.out.println("花花没找到");
		}
		
		
		System.out.println("==============================");
		//使用增强for循环进行：
		for(Cat item:set) {
			if("花花".equals(item.getName())) {
				set.remove(item);
			}
		}
		
		for(Cat cat:set) {
			System.out.println(cat);
		}

	}
}
