package com.itc.spring.student.Student;

public class Student {
	private int studentId;
	private String name;
	private gender studentGender;
	private int age;
	
	public enum gender{M,F};
	public Student(int studentId, String name,gender studentGender, int age) {
		super();
		this.studentId = studentId;
		this.name = name;
		this.studentGender=studentGender;
		this.age = age;
	}
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public gender getStudentGender() {
		return studentGender;
	}
	public void setStudentGender(gender studentGender) {
		this.studentGender = studentGender;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", name=" + name + ", Gender=" + studentGender + ", age=" + age + "]";
	}
	
	
	
}
