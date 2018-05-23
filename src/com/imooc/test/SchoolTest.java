package com.imooc.test;

import com.imooc.model.Subject;
import com.imooc.model.Student;

public class SchoolTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Subject subject1 = new Subject("计算机科学与技术", "001", 4);

		System.out.println(subject1.info());

		System.out.println("---------------------------------");

		Student student1 = new Student("00002912", "周杰伦", "男", 26, subject1);

		System.out.println(student1.introduction());

		System.out.println("---------------------------------");

		Student student2 = new Student("001", "jay", "boy", 28);

		System.out.println(student2.introduction("计算机科学与技术", 50));

		System.out.println("---------------------------------");

		System.out.println(student2.introduction(subject1));
	}

}
