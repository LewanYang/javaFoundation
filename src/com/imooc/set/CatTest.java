package com.imooc.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class CatTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cat cat1 = new Cat("����",12,"Ӣ����ëè");
		Cat cat2 = new Cat("����",3,"�л���԰è");
		
		Set set = new HashSet();
		set.add(cat1);
		set.add(cat2);
		
		Iterator it = set.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}	
	}
}
