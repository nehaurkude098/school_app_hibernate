package com.ty.school.controller;

import java.util.Scanner;

import com.ty.school.dao.StudentDao;
import com.ty.school.dto.Student;

public class FindStudentDriver {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		StudentDao dao=new StudentDao();
		System.out.println("enter student id ");
		int id=scanner.nextInt();
		Student student=dao.findStudent(id);
		System.out.println("roll num="+student.getRol());
		System.out.println("name="+student.getName());
		System.out.println("percentage="+student.getPercentage());
	}

}
