package com.ty.school.controller;

import java.util.Scanner;

import com.ty.school.dao.StudentDao;
import com.ty.school.dto.Student;

public class SaveStudentDriver {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		StudentDao dao=new StudentDao();
		Student student=new Student();
		System.out.println("enter student id");
		int rol=scanner.nextInt();
		System.out.println("enter student name");
		String name=scanner.next();
		System.out.println("enter percentage");
		double percentage=scanner.nextDouble();
		student.setName(name);
		student.setRol(rol);
		student.setPercentage(percentage);
		
		dao.saveStudent(student);
		
	}

}

