package com.jsp.pen;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class GetPen {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("Omkar");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
		Pen pen=entityManager.find(Pen.class,1);
		
		if (pen!=null) {
			System.out.println(pen.getId());
			System.out.println(pen.getBrand());
			System.out.println(pen.getColor());
			System.out.println(pen.getPrice());
		}else {
			System.out.println("No Pen object found");
		}

	}

}
