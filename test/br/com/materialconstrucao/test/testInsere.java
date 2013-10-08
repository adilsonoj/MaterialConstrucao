package br.com.materialconstrucao.test;

import javax.persistence.EntityManager;

import br.com.materialconstrucao.dao.LojaDao;
import br.com.materialconstrucao.dao.MaterialDao;
import br.com.materialconstrucao.modelo.Loja;
import br.com.materialconstrucao.modelo.Material;
import br.com.materialconstrucao.util.JPAUtil;

public class testInsere {

	public static void main(String[] args) {
		
			EntityManager em = new JPAUtil().getEntityManager();
			MaterialDao dao = new MaterialDao(em);
			LojaDao lojaDao = new LojaDao(em);
			Material material =new Material();
			
			em.getTransaction().begin();
			
			Loja loja = lojaDao.buscaPorId(2);
			
			
			material.setDescricao("com conta associada descricao");
			material.setMarca("xxxx");
			material.setNome("yyyyy");
			material.setLoja(loja);
			
			dao.adiciona(material);
			
			dao.buscaPorId(15);
			System.out.println(material.getLoja().getNomeComercial());
			
			em.getTransaction().commit();
			em.close();
			
			
			System.out.println(material.getDescricao());
			System.out.println("Inserido...");
		}

	}

