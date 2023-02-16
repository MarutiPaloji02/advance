package com.xworkz.valentineApp.repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.xworkz.valentineApp.entity.ValentineEntity;

@Repository
public class ValentineRepositoryImpl implements ValentineRepository {
	


	@Autowired
	private EntityManagerFactory entity;
	@Override
	public boolean save(ValentineEntity entity) {
		System.out.println("inside the save methode");
		EntityManager em=   this.entity.createEntityManager();
		EntityTransaction et=em.getTransaction();
		et.begin();
		em.persist(entity);
		et.commit();
		em.close();
		return true;
	}

}
