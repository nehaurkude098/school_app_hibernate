package com.ty.school.controller;

import java.util.Scanner;

import com.ty.school.dao.ReferenceBookDao;
import com.ty.school.dto.ReferenceBook;

public class GetBookByIdDriver {
	public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in);
		System.out.println("enter id");
		int id=scanner.nextInt();
		ReferenceBookDao bookDAO=new ReferenceBookDao();
		ReferenceBook book=bookDAO.findBook(id);
		System.out.println("book id="+book.getId());
		System.out.println("book name="+book.getName());
		System.out.println("book author="+book.getAuthor());
		System.out.println("book subject="+book.getSubject());
		
	}

}
