package com.ty.school.controller;


import java.util.Scanner;

import com.ty.school.dao.UserDao;
import com.ty.school.dto.User;

public class FindUserDriver {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		UserDao dao=new UserDao();
		System.out.println("enter user id");
		int id=scanner.nextInt();
		User user=dao.findUserById(id);
		System.out.println(user);
	}

}
