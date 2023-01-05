package com.jsp.pen;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class PenDriver {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("Omkar");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
		Pen p1=new Pen();
		p1.setBrand("Trimax");
		p1.setColor("Blue");
		p1.setPrice(10);
		
		entityTransaction.begin();
		entityManager.persist(p1);
		entityTransaction.commit();
		System.out.println("All good");

	}

}
