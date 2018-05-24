package com.imooc.model;

public class Subject {
	private String subjectName;
	private String subjectNo;
	private int subjectLife;
	private Student[] myStudents;
	private int studentNum;
	

	// 无参构造函数
	public Subject() {

	}

	// 有参构造函数  实现对学科名称、编号、学制年限的赋值
	public Subject(String subjectName, String subjectNo, int subjectLife) {
		this.setSubjectName(subjectName);
		this.setSubjectLife(subjectLife);
		this.setSubjectNo(subjectNo);
	}
	
	// 有参构造函数， 实现对学科.....和学生的赋值
	public Subject(String subjectName, String subjectNo, int subjectLife,Student[] myStudents) {
		this.setSubjectName(subjectName);
		this.setSubjectLife(subjectLife);
		this.setSubjectNo(subjectNo);
		this.setMyStudents(myStudents);
	}

	
	// 学生信息的数组
	public Student[] getMyStudents() {
		// 假如数组没有初始化
		if(this.myStudents==null) {
			this.myStudents = new Student[200];
		}
		return myStudents;
	}

	public void setMyStudents(Student[] myStudents) {
		this.myStudents = myStudents;
	}
	
	
	// 学生数量数组
	public int getStudentNum() {
		return studentNum;
	}

	public void setStudentNum(int studentNum) {
		this.studentNum = studentNum;
	}

	public String getSubjectName() {
		return subjectName;
	}

	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}

	public String getSubjectNo() {
		return subjectNo;
	}

	public void setSubjectNo(String subjectNo) {
		this.subjectNo = subjectNo;
	}

	public int getSubjectLife() {
		return subjectLife;
	}

	// 设置学制年限，限制必须>0
	public void setSubjectLife(int subjectLife) {
		if (subjectLife <= 0) {
			return;
		}
		this.subjectLife = subjectLife;
	}

	/**
	 * 专业介绍的方法
	 * @return 专业介绍的相关信息，包括名称、编号、年限
	 * 
	 */
	public String info() {
		String str = "专业信息如下：\n专业名称：" + this.getSubjectName() + "\n专业编号：" + this.getSubjectNo() + "\n专业年限："
				+ this.getSubjectLife();
		return str;
	}
	
	
	/**
	 * 1、添加学生到当前专业中
	 * 2、将学生个数保存到studentNum
	 */
	public void addStudent(Student stu) {
		for(int i=0;i<this.getMyStudents().length;i++) {
			if(this.getMyStudents()[i]==null) {
				stu.setStudentSubject(this);
				this.getMyStudents()[i]=stu;
				//2、将学生数量存在studentNum中
				this.setStudentNum(i+1);
				return;
			}
		}
	}

}
