package com.studentsystem;
import java.util.*;

public class Student {

	int rollNo;
	String name;
	String className;
	String dob;
	long phoneNo;
	String address;
	Map<String,Integer> map;
	
	
	
	public Student() {
		super();
	}
	public Student(int rollNo, String name, String className, String dob, long phoneNo, String address,
			Map<String, Integer> map) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.className = className;
		this.dob = dob;
		this.phoneNo = phoneNo;
		this.address = address;
		this.map = map;
	}
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getClassName() {
		return className;
	}
	public void setClassName(String className) {
		this.className = className;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public long getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(long phoneNo) {
		this.phoneNo = phoneNo;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Map<String, Integer> getMap() {
		return map;
	}
	public void setMap(Map<String, Integer> map) {
		this.map = map;
	}
	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + ", className=" + className + ", dob=" + dob
				+ ", phoneNo=" + phoneNo + ", address=" + address + ", map=" + map + "]";
	}
	
	
	
}
