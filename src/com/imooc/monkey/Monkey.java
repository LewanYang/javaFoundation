package com.imooc.monkey;

public class Monkey {
	String name;
	String feature;
	
	//�޲ι��췽��
	public Monkey() {
		this.name = "��β��";
		this.feature = "��β��";
	}
	
	//�вι��췽��
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
