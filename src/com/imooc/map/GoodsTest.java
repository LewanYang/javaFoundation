package com.imooc.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class GoodsTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner console = new Scanner(System.in);
		System.out.println("����������Ϣ");
		Map<String,Goods> goodsMap = new HashMap<String,Goods>();
		int i = 0;
		while(i<3) {
			System.out.println("�������"+(i+1)+"������");
			System.out.println("��������Ʒ���:");
			String goodsId = console.next();
			//�ж�ID�Ƿ��ظ�
			if(goodsMap.containsKey(goodsId)) {
				System.out.println("��Ʒ����Ѿ����ڣ�����д����");
				continue; //�˳��ô�ѭ����������һ��ѭ��
			}
			System.out.println("��������Ʒ����:");
			String goodsName = console.next();
			System.out.println("��������Ʒ�۸�");
			double goodsPrice = 0;
			try {
				goodsPrice = console.nextDouble();
			}catch(java.util.InputMismatchException e) {
				System.out.println("��Ʒ�۸�ĸ�ʽ����ȷ����������ֵ������");
				console.next();
				continue;
			}
			Goods goods = new Goods(goodsId,goodsName,goodsPrice);
			// ����Ʒ��Ϣ��ӵ�HashMap��
			goodsMap.put(goodsId, goods);
			i++;
		}
		//����Map,�����Ʒ��Ϣ
		//ʹ�õ�����
		System.out.println("��Ʒ��ȫ����ϢΪ:");
		Iterator<Goods> itGoods = goodsMap.values().iterator();
		while(itGoods.hasNext()) {
			System.out.println(itGoods.next());
		}
	}

}
