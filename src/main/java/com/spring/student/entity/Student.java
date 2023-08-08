package com.spring.student.entity;

import org.springframework.data.mongodb.core.mapping.Document;

import jakarta.persistence.Id;

@Document(collection = "Student")
public class Student 
{
	@Id
	private int studentId;
	
	private String studentName;
	private String address;
	private long contactNumber;
	private String course;
	private float fee;
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public long getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(long contactNumber) {
		this.contactNumber = contactNumber;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public float getFee() {
		return fee;
	}
	public void setFee(float fee) {
		this.fee = fee;
	}
	public Student(int studentId, String studentName, String address, long contactNumber, String course, float fee) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.address = address;
		this.contactNumber = contactNumber;
		this.course = course;
		this.fee = fee;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", address=" + address
				+ ", contactNumber=" + contactNumber + ", course=" + course + ", fee=" + fee + "]";
	}

}
