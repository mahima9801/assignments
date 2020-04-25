package com.capg.test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.capg.entities.Author;
import com.capg.entities.Book;

public class TestApp {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("JPA-app2");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		Author auth=new Author(101, "Urmi");
		Author auth1=new Author(102,"Yash");
		Book b=new Book(1001,"Tarun",1234,"A",2700);
		entityManager.getTransaction().begin();
		entityManager.persist(auth);
		entityManager.persist(auth1);
		entityManager.persist(b);
		entityManager.getTransaction().commit();
		System.out.println("Data Saved");
		entityManagerFactory.close();
		
	}

}
