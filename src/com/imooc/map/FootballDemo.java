package com.imooc.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class FootballDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//定义HashMap的对象并添加数据
        Map<String,String> football = new HashMap<String,String>();
		football.put("2006", "意大利");
		football.put("2010", "西班牙");
		football.put("2014", "德国");
		//使用迭代器的方式遍历
		Iterator<String> it = football.values().iterator();
		
		while(it.hasNext()) {
			System.out.print(it.next()+" ");
		}      
		System.out.println();
		//使用EntrySet同时获取key和value
		Set<Entry<String,String>> entrySet = football.entrySet();
		for(Entry<String,String> entry:entrySet) {
			System.out.println(entry.getKey()+"-"+entry.getValue());
		}
	}

}
