package com.imooc.model;

public class Subject {
	private String subjectName;
	private String subjectNo;
	private int subjectLife;

	// �޲ι��캯��
	public Subject() {

	}

	// �вι��캯��
	public Subject(String subjectName, String subjectNo, int subjectLife) {
		this.setSubjectName(subjectName);
		this.setSubjectLife(subjectLife);
		this.setSubjectNo(subjectNo);
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

}
