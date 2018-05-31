package com.imooc.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CatTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cat huahua = new Cat("jay",5,"短毛猫");
		Cat fanfan = new Cat("beckham",4,"田园猫");
		Cat maomao = new Cat("muller",7,"长毛猫");
		
		//list合计，先泛化
		List<Cat> listCat = new ArrayList<Cat>();
		listCat.add(huahua);
		listCat.add(fanfan);
		listCat.add(maomao);
		// 第一个参数是列表对象的名字,第二个参数是比较器
		System.out.println("排序前：");
		for(Cat item:listCat) {
			System.out.println(item);
		}
		
		Collections.sort(listCat,new NameComparator());
		System.out.println("======================");
		System.out.println("按名字升序排序：");
		for(Cat item:listCat) {
			System.out.println(item);
		}
	}

}
