package com.imooc.set;

public class Student {
	private int stuId;
	private String name;
	private float score;
	//getter && setter
	public int getStuId() {
		return stuId;
	}
	public void setStuId(int stuId) {
		this.stuId = stuId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getScore() {
		return score;
	}
	public void setScore(float score) {
		this.score = score;
	}
	//构造函数
	public Student(int stuId, String name, float score) {
		super();
		this.stuId = stuId;
		this.name = name;
		this.score = score;
	}
	//toString
	@Override
	public String toString() {
		return "[stuId=" + stuId + ", name=" + name + ", score=" + score + "]";
	}
	
	//hasCode and equals
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + Float.floatToIntBits(score);
		result = prime * result + stuId;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if(this == obj) {
			return true;
		}
		//判断obj中的学号和姓名是否相等
		if(obj.getClass()==Student.class) {
			Student student= (Student)obj;
			return student.getName().equals(name)&&student.getStuId()==stuId;
		}
		return false;
	}
	
	
	
	
}
