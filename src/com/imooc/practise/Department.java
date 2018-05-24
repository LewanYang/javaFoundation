package com.imooc.practise;

public class Department {
	private int departmentNum;
	private String departmentName;
	private Stuff[] stuffs;
	public int stuffNum=0;
	
	/**
	 * �вι��캯��
	 */
	public Department(int departmentNum, String departmentName) {
		this.setDepartmentName(departmentName);
		this.setDepartmentNum(departmentNum);
	}
	
	public Department(String departmentName,Stuff[] stuffs) {
		this.setStuffs(stuffs);
		this.setDepartmentName(departmentName);
	}

	
	/**
	 * getter && setter
	 * @return
	 */
	public int getDepartmentNum() {
		return departmentNum;
	}
	public void setDepartmentNum(int departmentNum) {
		this.departmentNum = departmentNum;
	}
	public String getDepartmentName() {
		return departmentName;
	}
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	public Stuff[] getStuffs() {
		if(this.stuffs==null) {
			this.stuffs = new Stuff[200];
		}
		return stuffs;
	}
	public void setStuffs(Stuff[] stuffs) {
		this.stuffs = stuffs;
	}
	
	
	/**
	 * ����ò�������
	 */
	public void addStuff() {
		for(int i=0;i<this.stuffs.length;i++) {
			if(stuffs[i].getDep().getDepartmentName()==this.getDepartmentName()) {
				this.stuffNum++;
			}
		}
		System.out.println(this.departmentName+"�ܹ���"+this.stuffNum+"��Ա��");
	}
	
	
}
