package com.imooc.earth;

public class Earth {
	/**
	 * 这里使用懒汉式
	 * 类内实例对象创建时并不直接初始化，直到第一次调用get方法时，才完成初始化操作；
	 */
	
	// 1、创建类中的私有构造
	private Earth() {
		
	}
	
	//2、创建该类型的私有静态实例
	private static Earth earth = null;
	
	//3、创建共有静态方法返回静态实例对象
	public static Earth getEarth() {
		if(earth == null) {
			earth = new Earth();
		}
		return earth;
	}
}
