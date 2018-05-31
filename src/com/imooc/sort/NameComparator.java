package com.imooc.sort;

import java.util.Comparator;

public class NameComparator implements Comparator<Cat> {

	@Override
	public int compare(Cat cat1, Cat cat2) {
		// TODO Auto-generated method stub
		String name1 = cat1.getName();
		String name2 = cat2.getName();
		int n = name1.compareTo(name2);
		return n;
	}
}
