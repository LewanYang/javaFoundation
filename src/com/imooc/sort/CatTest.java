package com.imooc.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CatTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cat huahua = new Cat("jay",5,"��ëè");
		Cat fanfan = new Cat("beckham",4,"��԰è");
		Cat maomao = new Cat("muller",7,"��ëè");
		
		//list�ϼƣ��ȷ���
		List<Cat> listCat = new ArrayList<Cat>();
		listCat.add(huahua);
		listCat.add(fanfan);
		listCat.add(maomao);
		// ��һ���������б���������,�ڶ��������ǱȽ���
		System.out.println("����ǰ��");
		for(Cat item:listCat) {
			System.out.println(item);
		}
		
		Collections.sort(listCat,new NameComparator());
		System.out.println("======================");
		System.out.println("��������������");
		for(Cat item:listCat) {
			System.out.println(item);
		}
	}

}
