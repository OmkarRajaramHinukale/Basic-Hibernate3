package com.jsp.bike;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class BikeDriver {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("Omkar");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
		Bike b1=new Bike();
		b1.setId(2);
		b1.setBrand("Hero");
		b1.setModel("Splendor");
		
		entityTransaction.begin();
		entityManager.persist(b1);
		entityTransaction.commit();
		System.out.println("All good");
	}

}
