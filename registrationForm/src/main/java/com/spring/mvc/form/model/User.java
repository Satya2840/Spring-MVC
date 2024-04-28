package com.spring.mvc.form.model;

public class User {
	
	private String name;
	private String emailid;
	private Integer phNo;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmailid() {
		return emailid;
	}
	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}
	public Integer getPhNo() {
		return phNo;
	}
	public void setPhNo(Integer phNo) {
		this.phNo = phNo;
	}
	@Override
	public String toString() {
		return "User [name=" + name + ", emailid=" + emailid + ", phNo=" + phNo + "]";
	}
	
	

}
