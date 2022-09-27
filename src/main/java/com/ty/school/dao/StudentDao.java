package com.ty.school.dao;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence; 

import com.ty.school.dto.Student;

public class StudentDao {
	EntityManagerFactory entityManagerFactory=null;
	
	public Student saveStudent(Student s)
	{
		entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.persist(s);
		entityTransaction.commit();
		return s;
		
	}
	public Student findStudent(int id)
	{
		entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		Student s=entityManager.find(Student.class, id);
		return s;
		
	}
	public boolean deleteStudent(int id)
	{
		entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		Student s=entityManager.find(Student.class, id);
		EntityTransaction entityTransaction=entityManager.getTransaction();
		if (s!=null) {
			entityTransaction.begin();
			entityManager.remove(s);
			entityTransaction.commit();
			return true;
		}
		return false;
		
	}
	public Student updateStudent(Student s)
	{
		entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		entityTransaction.begin();
		Student s1=entityManager.merge(s);
		entityTransaction.commit();
		return s1;
		
	}

}
