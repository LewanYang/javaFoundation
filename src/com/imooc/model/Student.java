package com.imooc.model;

public class Student {
	// 成员属性：学号，姓名，性别，年龄
	private String studentNo;
	private String studentName;
	private String studentSex;
	private int studentAge;
	private Subject studentSubject;

	// 无参构造方法
	public Student() {

	}

	// 有参构造方法
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
	 * 学生自我介绍的方法
	 * 
	 * @return
	 */
	public String introduction() {
		String str = "学生信息如下： \n姓名：" + this.getStudentName() + "\n学号:" + this.getStudentNo() + "\n性别："
				+ this.getStudentSex() + "\n年龄：" + this.getStudentAge();
		return str;
	}

	/**
	 * 第二个方法，添加了学科和学时
	 * 
	 */
	public String introduction(String subjectName,int subjectLife) {
		String str = "学生信息如下： \n姓名：" + this.getStudentName() + "\n学号:" + this.getStudentNo() + "\n性别："
				+ this.getStudentSex() + "\n年龄：" + this.getStudentAge()+"\n专业："+subjectName+"\n学时："+subjectLife;
		return str;
	}
	
	
	/**
	 * 第三种方法
	 * 
	 */
	public String introduction(Subject sub) {
		String str = "学生信息如下： \n姓名：" + this.getStudentName() + "\n学号:" + this.getStudentNo() + "\n性别："
				+ this.getStudentSex() + "\n年龄：" + this.getStudentAge()+"\n专业："+sub.getSubjectName()+"\n学时："+sub.getSubjectLife();
		return str;
	}
}
