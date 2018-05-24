package com.imooc.practise;

public class Job {
	private int jobNum;
	private String jobName;
	public int getJobNum() {
		return jobNum;
	}
	public void setJobNum(int jobNum) {
		this.jobNum = jobNum;
	}
	public String getJobName() {
		return jobName;
	}
	public void setJobName(String jobName) {
		this.jobName = jobName;
	}
	
	public Job(int jobNum,String jobName) {
		this.setJobNum(jobNum);
		this.setJobName(jobName);
	}
}
