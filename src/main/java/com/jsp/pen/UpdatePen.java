package com.jsp.pen;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class UpdatePen {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("Omkar");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
		Pen pen=entityManager.find(Pen.class, 3);
		pen.setBrand("Trimax");
		if (pen!=null) {
			entityTransaction.begin();
			entityManager.merge(pen); 
			entityTransaction.commit();
			System.out.println("Data updated");
		}else {
			System.out.println("Data not updated");
		}

	}

}
