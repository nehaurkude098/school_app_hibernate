package com.ty.school.controller;

import java.util.Scanner;

import com.ty.school.dao.ReferenceBookDao;

public class DeleteBookDriver {
	public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in);
		ReferenceBookDao bookDAO=new ReferenceBookDao();
		System.out.println("enter id");
		int id=scanner.nextInt();
		System.out.println(bookDAO.deleteBook(id));;
	}

}