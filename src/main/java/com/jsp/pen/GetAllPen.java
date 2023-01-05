package com.jsp.pen;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class GetAllPen {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("Omkar");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		
		String sql="Select p from Pen p";
		Query query=entityManager.createQuery(sql);
		List<Pen> pens=query.getResultList();
		
		for (Pen p : pens) {
			System.out.println("==============");
			System.out.println(p.getId());
			System.out.println(p.getBrand());
			System.out.println(p.getColor());
			System.out.println(p.getPrice());
		}
		

	}

}
