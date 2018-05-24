package com.imooc.model;

public class Subject {
	private String subjectName;
	private String subjectNo;
	private int subjectLife;
	private Student[] myStudents;
	private int studentNum;
	

	// �޲ι��캯��
	public Subject() {

	}

	// �вι��캯��  ʵ�ֶ�ѧ�����ơ���š�ѧ�����޵ĸ�ֵ
	public Subject(String subjectName, String subjectNo, int subjectLife) {
		this.setSubjectName(subjectName);
		this.setSubjectLife(subjectLife);
		this.setSubjectNo(subjectNo);
	}
	
	// �вι��캯���� ʵ�ֶ�ѧ��.....��ѧ���ĸ�ֵ
	public Subject(String subjectName, String subjectNo, int subjectLife,Student[] myStudents) {
		this.setSubjectName(subjectName);
		this.setSubjectLife(subjectLife);
		this.setSubjectNo(subjectNo);
		this.setMyStudents(myStudents);
	}

	
	// ѧ����Ϣ������
	public Student[] getMyStudents() {
		// ��������û�г�ʼ��
		if(this.myStudents==null) {
			this.myStudents = new Student[200];
		}
		return myStudents;
	}

	public void setMyStudents(Student[] myStudents) {
		this.myStudents = myStudents;
	}
	
	
	// ѧ����������
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

	// ����ѧ�����ޣ����Ʊ���>0
	public void setSubjectLife(int subjectLife) {
		if (subjectLife <= 0) {
			return;
		}
		this.subjectLife = subjectLife;
	}

	/**
	 * רҵ���ܵķ���
	 * @return רҵ���ܵ������Ϣ���������ơ���š�����
	 * 
	 */
	public String info() {
		String str = "רҵ��Ϣ���£�\nרҵ���ƣ�" + this.getSubjectName() + "\nרҵ��ţ�" + this.getSubjectNo() + "\nרҵ���ޣ�"
				+ this.getSubjectLife();
		return str;
	}
	
	
	/**
	 * 1�����ѧ������ǰרҵ��
	 * 2����ѧ���������浽studentNum
	 */
	public void addStudent(Student stu) {
		for(int i=0;i<this.getMyStudents().length;i++) {
			if(this.getMyStudents()[i]==null) {
				this.getMyStudents()[i]=stu;
				//2����ѧ����������studentNum��
				this.setStudentNum(i+1);
				return;
			}
		}
	}

}
