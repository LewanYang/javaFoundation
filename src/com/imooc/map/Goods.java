package com.imooc.map;

public class Goods {
	private String id;
	private String name;
	private double price;
	
	//getter and setter
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	//构造方法
	public Goods(String id, String name, double price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}
	
	// toString
	@Override
	public String toString() {
		return "[id=" + id + ", name=" + name + ", price=" + price + "]";
	}
}
