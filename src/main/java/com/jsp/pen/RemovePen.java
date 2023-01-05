package com.jsp.pen;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class RemovePen {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("Omkar");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
		Pen pen=entityManager.find(Pen.class,1);
		if (pen!=null) {
			entityTransaction.begin();
			entityManager.remove(pen);
			entityTransaction.commit();
			System.out.println("object with above id removed");
		}else {
			System.out.println("no such id found");
		}
	}

}
