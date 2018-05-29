package com.imooc.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class WordDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 将英文单词添加到HashSet中
		Set set = new HashSet();
		//向集合中添加元素
		set.add("blue");
		set.add("orange");
		set.add("yellow");
		set.add("white");
		set.add("black");
		
		//显示结合的内容
		System.out.println("使用迭代器Iterator来遍历集合");
		Iterator it = set.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
