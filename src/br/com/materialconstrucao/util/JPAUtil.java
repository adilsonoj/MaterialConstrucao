package br.com.materialconstrucao.util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JPAUtil {
	private static EntityManagerFactory factory = 
			Persistence.createEntityManagerFactory("materialconstrucao");
	
	public EntityManager getEntityManager(){
		return factory.createEntityManager();
	}
	
}
