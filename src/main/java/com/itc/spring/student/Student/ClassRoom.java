package com.itc.spring.student.Student;

import org.springframework.beans.factory.annotation.Autowired;

public class ClassRoom {
	@Autowired
private Student student;

public ClassRoom(Student student)
{
	this.student=student;
}
public void DisplayDetails() {
	System.out.println(student);
}
}
