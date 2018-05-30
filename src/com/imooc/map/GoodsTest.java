package com.imooc.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class GoodsTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner console = new Scanner(System.in);
		System.out.println("输入三条信息");
		Map<String,Goods> goodsMap = new HashMap<String,Goods>();
		int i = 0;
		while(i<3) {
			System.out.println("请输入第"+(i+1)+"条内容");
			System.out.println("请输入商品编号:");
			String goodsId = console.next();
			//判断ID是否重复
			if(goodsMap.containsKey(goodsId)) {
				System.out.println("商品编号已经存在，请重写输入");
				continue; //退出该次循环，继续下一次循环
			}
			System.out.println("请输入商品名称:");
			String goodsName = console.next();
			System.out.println("请输入商品价格：");
			double goodsPrice = 0;
			try {
				goodsPrice = console.nextDouble();
			}catch(java.util.InputMismatchException e) {
				System.out.println("商品价格的格式不正确，请输入数值型数据");
				console.next();
				continue;
			}
			Goods goods = new Goods(goodsId,goodsName,goodsPrice);
			// 将商品信息添加到HashMap中
			goodsMap.put(goodsId, goods);
			i++;
		}
		//遍历Map,输出商品信息
		//使用迭代器
		System.out.println("商品的全部信息为:");
		Iterator<Goods> itGoods = goodsMap.values().iterator();
		while(itGoods.hasNext()) {
			System.out.println(itGoods.next());
		}
	}

}
