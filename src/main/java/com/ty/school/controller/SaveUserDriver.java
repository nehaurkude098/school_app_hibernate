package com.ty.school.controller;

import java.util.Scanner;

import com.ty.school.dao.UserDao;
import com.ty.school.dto.User;

public class SaveUserDriver {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		User user=new User();
		UserDao dao=new UserDao();
		System.out.println("enter user id");
		int id=scanner.nextInt();
		System.out.println("enter user name");
		String name=scanner.next();
		System.out.println("enter email");
		String email=scanner.next();
		System.out.println("enter password");
		String password=scanner.next();
		System.out.println("enter phone");
		long phone=scanner.nextLong();
		System.out.println("enter gender");
		String gender=scanner.next();
		
		user.setEmail(email);
		user.setGender(gender);
		user.setId(id);
		user.setName(name);
		user.setPassword(password);
		user.setPhone(phone);
		dao.saveUser(user);
		
	}

}

