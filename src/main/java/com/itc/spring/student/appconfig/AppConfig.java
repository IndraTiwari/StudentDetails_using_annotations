package com.itc.spring.student.appconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.itc.spring.student.Student.ClassRoom;
import com.itc.spring.student.Student.Student;
import com.itc.spring.student.Student.Student.gender;

@Configuration
public class AppConfig {
@Bean
public Student getDetails() {
	return new Student(101, "Indra",gender.M, 25);
}

@Bean
public ClassRoom DisplaayClassRoom(Student student) {
	return new ClassRoom(student);
}
}
