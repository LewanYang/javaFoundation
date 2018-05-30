package com.imooc.set;

public class Cat {
	private String name;;
	private int month;
	private String species;
	
	// 构造函数
	public Cat(String name, int month, String species) {
		super();
		this.name = name;
		this.month = month;
		this.species = species;
	}
	
	//getter and setter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public String getSpecies() {
		return species;
	}
	public void setSpecies(String species) {
		this.species = species;
	}

	@Override
	public String toString() {
		return "[name=" + name + ", month=" + month + ", species=" + species + "]";
	}

	//hashCode and equals
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + month;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((species == null) ? 0 : species.hashCode());
		return result;
	}

	@Override
	//判断是否相等
	public boolean equals(Object obj) {
		//先判断对象是否相等,相等返回true
		if(this==obj) {
			return true;
		}
		//判断obj内的内容是否相等
		if(obj.getClass()==Cat.class) {
			Cat cat = (Cat)obj;
			return cat.getName().equals(name)&&cat.getMonth()==month&&cat.getSpecies().equals(species);
		}
		return false;
	}
	
	
	
	
}
