package com.imooc.generic;


/**
 * 自定义泛行类
 * 感觉像自定义集合
 * @author 32783
 *
 */
public class NumGeneric<T>{
	private T num;
	public T getNum() {
		return num;
	}
	public void setNum(T num) {
		this.num = num;
	}
	
	//测试
	public static void main(String[] args) {
		//就和使用ArrayList一样
		NumGeneric<Integer> intNum = new NumGeneric<Integer>();
		intNum.setNum(10);
		System.out.println("Integer:"+intNum.getNum());
	}
}
