package com.imooc.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class FootballDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//����HashMap�Ķ����������
        Map<String,String> football = new HashMap<String,String>();
		football.put("2006", "�����");
		football.put("2010", "������");
		football.put("2014", "�¹�");
		//ʹ�õ������ķ�ʽ����
		Iterator<String> it = football.values().iterator();
		
		while(it.hasNext()) {
			System.out.print(it.next()+" ");
		}      
		System.out.println();
		//ʹ��EntrySetͬʱ��ȡkey��value
		Set<Entry<String,String>> entrySet = football.entrySet();
		for(Entry<String,String> entry:entrySet) {
			System.out.println(entry.getKey()+"-"+entry.getValue());
		}
	}

}
