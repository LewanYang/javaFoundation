package com.imooc.test;

import com.imooc.model.Subject;
import com.imooc.model.Student;

public class SchoolTest {

	/**
	 * @param args
	 */
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Subject subject1 = new Subject("�������ѧ�뼼��", "001", 4);

		//System.out.println(subject1.info());

		System.out.println("---------------------------------");

		Student student1 = new Student("00002912", "�ܽ���", "��", 26, subject1);

		//System.out.println(student1.introduction());

		//System.out.println("---------------------------------");

		//Student student2 = new Student("001", "jay", "boy", 28);

		//System.out.println(student2.introduction("�������ѧ�뼼��", 50));

		//System.out.println("---------------------------------");

		//System.out.println(student2.introduction(subject1));
		
		//System.out.println("---------------------------------");
		
		// ����ָ��רҵ�е����ж���ѧ������
		subject1.addStudent(student1);
		//subject1.addStudent(student2);
		System.out.println(subject1.getSubjectName()+"��רҵ������"+subject1.getStudentNum()+"ѧ�������˱���");
		
	}

}