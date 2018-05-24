package com.imooc.practise;

public class Test {
	public static void main(String[] args) {
		
		Department dep1 = new Department(1,"人事部");
		Department dep2 = new Department(2,"市场部");
		
		Job job1 = new Job(1,"助理");
		Job job2 = new Job(2,"职员");
		Job job3 = new Job(3,"经理");
		
		Stuff stuff1 = new Stuff("张明",1,29,"男",dep1,job3);
		Stuff stuff2 = new Stuff("李艾爱",2,21,"女",dep1,job1);
		Stuff stuff3 = new Stuff("孙超",4,29,"男",dep1,job1);
		Stuff stuff4 = new Stuff("张美美",5,26,"女",dep2,job2);
		Stuff stuff5 = new Stuff("蓝迪",6,37,"男",dep2,job3);
		
		System.out.println(stuff1.introduction());
		System.out.println("=======================");
		System.out.println(stuff2.introduction());
		System.out.println("=======================");
		System.out.println(stuff3.introduction());
		System.out.println("=======================");
		System.out.println(stuff4.introduction());
		System.out.println("=======================");
		System.out.println(stuff5.introduction());
		System.out.println("=======================");

		Stuff[] stuffArr = {stuff1,stuff2,stuff3,stuff4,stuff5};
		
		Department depNum1 = new Department(dep1.getDepartmentName(),stuffArr);
		depNum1.addStuff();
		Department depNum2 = new Department(dep2.getDepartmentName(),stuffArr);
		depNum2.addStuff();
	}
}
