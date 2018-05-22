package com.imooc.monkey;

public class Monkey {
	String name;
	String feature;
	
	//无参构造方法
	public Monkey() {
		this.name = "长尾巴";
		this.feature = "长尾猴";
	}
	
	//有参构造方法
	public Monkey(String name,String feature) {
		this.name= name;
		this.feature = feature;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFeature() {
		return feature;
	}

	public void setFeature(String feature) {
		this.feature = feature;
	}
	
}
