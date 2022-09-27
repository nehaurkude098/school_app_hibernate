package com.ty.school.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ty.school.dto.ReferenceBook;


public class ReferenceBookDao {
EntityManagerFactory entityManagerFactory=null;
	
	public ReferenceBook saveBook(ReferenceBook s)
	{
		entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.persist(s);
		entityTransaction.commit();
		return s;
		
	}
	public ReferenceBook findBook(int id)
	{
		entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		ReferenceBook s=entityManager.find(ReferenceBook.class, id);
		return s;
		
	}
	public boolean deleteBook(int id)
	{
		entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		ReferenceBook s=entityManager.find(ReferenceBook.class, id);
		EntityTransaction entityTransaction=entityManager.getTransaction();
		if (s!=null) {
			entityTransaction.begin();
			entityManager.remove(s);
			entityTransaction.commit();
			return true;
		}
		return false;
		
	}
	public ReferenceBook updateStudent(ReferenceBook s)
	{
		entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		entityTransaction.begin();
		ReferenceBook s1=entityManager.merge(s);
		entityTransaction.commit();
		return s1;
		
	}

}
