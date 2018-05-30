package com.imooc.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class DictionaryDemo {
	public static void main(String[] args) {
		//首先使用泛行
		Map<String,String> animal = new HashMap<String,String>();
		//键盘输入
		Scanner console = new Scanner(System.in);
		//添加数据
		int i = 0;
		while(i<3) {
			System.out.println("请输入KEY值：");
			String key = console.next();
			System.out.println("请输入VALUE值：");
			String value = console.next();
			animal.put(key, value);
			i++;
		}
		System.out.println("========================");
		//使用迭代器
		System.out.println("输出所有value");
		Iterator<String> it = animal.values().iterator();
		while(it.hasNext()) {
			System.out.print(it.next()+" ");
		}
		
		//得到key和value值
		System.out.println("通过entrySet方法获得key-value值");
		Set<Entry<String,String>> entrySet = animal.entrySet();
		for(Entry<String,String> entry:entrySet) {
			System.out.println(entry.getKey()+"-"+entry.getValue());
		}
		
		//通过单词找到注释并输出
		//使用keySet方法
		System.out.println("请输入要查找的单词:");
		//实际上keySet()方法可以获取key值；
		String strSearch = console.next();
		// 取得keyset
		Set<String> keySet = animal.keySet();
		//for增强型
		for(String key:keySet) {
			if(strSearch.equals(key)) {
				System.out.println("找到了"+key+":"+animal.get(key));
				break;
			}
		}
		
	}
}
