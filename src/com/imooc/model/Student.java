package com.imooc.model;

public class Student {
	// ��Ա���ԣ�ѧ�ţ��������Ա�����
	private String studentNo;
	private String studentName;
	private String studentSex;
	private int studentAge;
	private Subject studentSubject;

	// �޲ι��췽��
	public Student() {

	}

	// �вι��췽��
	public Student(String studentNo, String studentName, String studentSex, int studentAge) {
		this.setStudentNo(studentNo);
		this.setStudentName(studentName);
		this.setStudentAge(studentAge);
		this.setStudentSex(studentSex);
	}

	// getter && setter
	
	
	public String getStudentNo() {
		return studentNo;
	}

	public Subject getStudentSubject() {
		if(studentSubject == null) {
			this.studentSubject = new Subject();
		}
		return studentSubject;
	}

	public void setStudentSubject(Subject studentSubject) {
		this.studentSubject = studentSubject;
	}

	public void setStudentNo(String studentNo) {
		this.studentNo = studentNo;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getStudentSex() {
		return studentSex;
	}

	public void setStudentSex(String studentSex) {
		this.studentSex = studentSex;
	}

	public int getStudentAge() {
		return studentAge;
	}

	public void setStudentAge(int studentAge) {
		if (studentAge < 10 || studentAge > 100) {
			this.studentAge = 18;
		} else {
			this.studentAge = studentAge;
		}
	}

	/**
	 * ѧ�����ҽ��ܵķ���
	 * 
	 * @return
	 */
	public String introduction() {
		String str = "ѧ����Ϣ���£� \n������" + this.getStudentName() + "\nѧ��:" + this.getStudentNo() + "\n�Ա�"
				+ this.getStudentSex() + "\n���䣺" + this.getStudentAge();
		return str;
	}

	/**
	 * �ڶ��������������ѧ�ƺ�ѧʱ
	 * 
	 */
	public String introduction(String subjectName,int subjectLife) {
		String str = "ѧ����Ϣ���£� \n������" + this.getStudentName() + "\nѧ��:" + this.getStudentNo() + "\n�Ա�"
				+ this.getStudentSex() + "\n���䣺" + this.getStudentAge()+"\nרҵ��"+subjectName+"\nѧʱ��"+subjectLife;
		return str;
	}
	
	
	/**
	 * �����ַ���
	 * 
	 */
	public String introduction(Subject sub) {
		String str = "ѧ����Ϣ���£� \n������" + this.getStudentName() + "\nѧ��:" + this.getStudentNo() + "\n�Ա�"
				+ this.getStudentSex() + "\n���䣺" + this.getStudentAge()+"\nרҵ��"+sub.getSubjectName()+"\nѧʱ��"+sub.getSubjectLife();
		return str;
	}
}
