package com.imooc.earth;

public class Test {
	public static void main(String[] args) {
		Earth one = Earth.getEarth();
		Earth two = Earth.getEarth();
		Earth three = Earth.getEarth();
		
		System.out.println(one+" "+two+" "+three);
	}
}
