package com.imooc.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class StudentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student stu1 = new Student(1,"jay",20);
		Student stu2 = new Student(2,"Beckham",30);
		Student stu3 = new Student(3,"harden",40);
		
		Set set = new HashSet();
		set.add(stu1);
		set.add(stu2);
		set.add(stu3);
		
		Iterator it = set.iterator();
		
		//使用while进行循环
		//显示内容
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println("========================");
		//添加一个重复的set
		Student stu4 = new Student(1,"jay",20);
		set.add(stu4);
		it = set.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
	}

}
