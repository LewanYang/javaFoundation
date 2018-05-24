package com.imooc.practise;

public class Stuff {
	private String stuffName;
	private int stuffNum;
	private int stuffAge;
	private String stuffSex;
	private Department dep;
	private Job job;

	/**
	 * 构造函数
	 * 
	 * @param stuffName
	 * @param stuffNum
	 * @param stuffAge
	 * @param stuffSex
	 * @param dep
	 * @param job
	 */
	public Stuff(String stuffName, int stuffNum, int stuffAge, String stuffSex, Department dep, Job job) {
		this.setStuffName(stuffName);
		this.setStuffNum(stuffNum);
		this.setStuffAge(stuffAge);
		this.setStuffSex(stuffSex);
		this.setDep(dep);
		this.setJob(job);
	}

	/**
	 * getter and setter
	 * 
	 * @return
	 */
	public String getStuffName() {
		return stuffName;
	}

	public void setStuffName(String stuffName) {
		this.stuffName = stuffName;
	}

	public int getStuffNum() {
		return stuffNum;
	}

	public void setStuffNum(int stuffNum) {
		if (stuffNum < 18 || stuffNum > 65) {
			this.stuffNum = 18;
		} else {
			this.stuffNum = stuffNum;
		}
	}

	public int getStuffAge() {
		return stuffAge;
	}

	public void setStuffAge(int stuffAge) {
		this.stuffAge = stuffAge;
	}

	public String getStuffSex() {
		return stuffSex;
	}

	public void setStuffSex(String stuffSex) {
		if (stuffSex != "男" && stuffSex != "女") {
			this.stuffSex = "男";
		} else {
			this.stuffSex = stuffSex;
		}

	}

	public Department getDep() {
		return dep;
	}

	public void setDep(Department dep) {
		this.dep = dep;
	}

	public Job getJob() {
		return job;
	}

	public void setJob(Job job) {
		this.job = job;
	}

	/***
	 * 实现自我介绍
	 */
	public String introduction() {
		String str = "员工信息：\n" + "姓名：" + this.getStuffName() + "\n工号：" + this.getStuffNum() + "\n性别："
				+ this.getStuffSex() + "\n年龄：" + this.getStuffAge() + "\n职务：" + this.getJob().getJobName();
		return str;
	}
	
	

}
