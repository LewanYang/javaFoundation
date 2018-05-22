package com.imooc.animal;

public class CatTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cat Cat1 = new Cat("jay",1,25,"Ó¢¹úÐ¡Ã¨");
		Cat1.setMonth(3);
		int num = Cat1.getMonth();
		double catWeight = Cat1.getWeight();
		String name = Cat1.getName();
		String species = Cat1.getSpecies();
		System.out.println(num+" "+catWeight+" "+name+" "+species);
	}
}
