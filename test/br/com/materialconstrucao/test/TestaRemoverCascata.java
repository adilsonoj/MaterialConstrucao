package br.com.materialconstrucao.test;

import java.math.BigDecimal;
import java.util.Calendar;

import javax.persistence.EntityManager;

import br.com.materialconstrucao.dao.LojaDao;
import br.com.materialconstrucao.modelo.Loja;
import br.com.materialconstrucao.modelo.TipoPagamento;
import br.com.materialconstrucao.util.JPAUtil;

public class TestaRemoverCascata {

	public static void main(String[] args) {
		EntityManager manager = new JPAUtil().getEntityManager();
		
		//Loja loja = new Loja();
		LojaDao lojaDao = new LojaDao(manager);
		manager.getTransaction().begin();
		
		Loja loja = lojaDao.buscaPorId(2);
	
		lojaDao.remove(loja);
			
	manager.getTransaction().commit();
	manager.close();
	System.out.println("Removendo...");

	}

}
