package com.imooc.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class DictionaryDemo {
	public static void main(String[] args) {
		//����ʹ�÷���
		Map<String,String> animal = new HashMap<String,String>();
		//��������
		Scanner console = new Scanner(System.in);
		//�������
		int i = 0;
		while(i<3) {
			System.out.println("������KEYֵ��");
			String key = console.next();
			System.out.println("������VALUEֵ��");
			String value = console.next();
			animal.put(key, value);
			i++;
		}
		System.out.println("========================");
		//ʹ�õ�����
		System.out.println("�������value");
		Iterator<String> it = animal.values().iterator();
		while(it.hasNext()) {
			System.out.print(it.next()+" ");
		}
		
		//�õ�key��valueֵ
		System.out.println("ͨ��entrySet�������key-valueֵ");
		Set<Entry<String,String>> entrySet = animal.entrySet();
		for(Entry<String,String> entry:entrySet) {
			System.out.println(entry.getKey()+"-"+entry.getValue());
		}
		
		//ͨ�������ҵ�ע�Ͳ����
		//ʹ��keySet����
		System.out.println("������Ҫ���ҵĵ���:");
		//ʵ����keySet()�������Ի�ȡkeyֵ��
		String strSearch = console.next();
		// ȡ��keyset
		Set<String> keySet = animal.keySet();
		//for��ǿ��
		for(String key:keySet) {
			if(strSearch.equals(key)) {
				System.out.println("�ҵ���"+key+":"+animal.get(key));
				break;
			}
		}
		
	}
}
