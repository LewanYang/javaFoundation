package com.imooc.inner;

public class OuterClass {
	private String name;
	private int age;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}


	public class InnerClass{
		public InnerClass() {
			// 可以直接访问外部类的成员属性
			name = "jay";
			age = 25;
		}
		
		public void display() {
			System.out.println(getName()+"今年"+getAge()+"岁了");
		}
		
	}
	
	public static void main(String[] args) {
		OuterClass out = new OuterClass();
		OuterClass.InnerClass inn = out.new InnerClass();
		
		inn.display();
	}
}
