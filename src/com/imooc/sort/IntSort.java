package com.imooc.sort;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class IntSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list = new ArrayList<Integer>();
		list.add(9);
		list.add(32);
		list.add(2);
		list.add(10);
		list.add(2);
		
		System.out.println("≈≈–Ú«∞£∫");
		for(int n:list) {
			System.out.print(n+" ");
		}
		
		System.out.println("==========================");
		Collections.sort(list);
		System.out.println("≈≈–Ú∫Û£∫");
		for(int n:list) {
			System.out.print(n+" ");
		}
		
	}

}
