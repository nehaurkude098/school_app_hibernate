package com.ty.school.controller;

import java.util.Scanner;

import com.ty.school.dao.ReferenceBookDao;
import com.ty.school.dto.ReferenceBook;

public class UpdateBookDriver {
	public static void main(String[] args) {
		ReferenceBook book=new ReferenceBook();
		ReferenceBookDao bookDAO=new ReferenceBookDao();
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter book id");
		int id=scanner.nextInt();
		System.out.println("enter book name");
		String name=scanner.next();
		System.out.println("enter author name");
		String author=scanner.next();
		System.out.println("enter subject");
		String subject=scanner.next();
		book.setAuthor(author);
		book.setId(id);
		book.setName(name);
		book.setSubject(subject);
		bookDAO.updateStudent(book);
	}


}
