package com.imooc.set;

public class Cat {
	private String name;;
	private int month;
	private String species;
	
	// ¹¹Ôìº¯Êý
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
	
	
	
	
}
