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
			// ����ֱ�ӷ����ⲿ��ĳ�Ա����
			name = "jay";
			age = 25;
		}
		
		public void display() {
			System.out.println(getName()+"����"+getAge()+"����");
		}
		
	}
	
	public static void main(String[] args) {
		OuterClass out = new OuterClass();
		OuterClass.InnerClass inn = out.new InnerClass();
		
		inn.display();
	}
}
