package com.imooc.signleton;

//饿汉式：创建对象实例的时候直接初始化
public class SingletonOne {
	//1、创建类中私有构造
	private SingletonOne() {
		
	}
	//2、创建该类型的私有静态实例
	private static SingletonOne instance = new SingletonOne();  //直接初始化了；
	
	//3、创建共有静态方法返回静态实例对象
	public static SingletonOne getInstance() {
		return instance;
	}
}
