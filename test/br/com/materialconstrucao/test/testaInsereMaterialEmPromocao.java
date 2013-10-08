package br.com.materialconstrucao.test;

import java.math.BigDecimal;
import java.util.Calendar;

import javax.persistence.EntityManager;

import br.com.materialconstrucao.dao.MaterialDao;
import br.com.materialconstrucao.dao.MaterialEmPromocaoDao;
import br.com.materialconstrucao.modelo.Material;
import br.com.materialconstrucao.modelo.MaterialEmPromocao;
import br.com.materialconstrucao.util.JPAUtil;

public class testaInsereMaterialEmPromocao {
	public static void main(String[] args) {
	EntityManager manager = new JPAUtil().getEntityManager();
	
	MaterialEmPromocaoDao emPromocaoDao = new MaterialEmPromocaoDao(manager);
	MaterialEmPromocao emPromocao = new MaterialEmPromocao(); 
	
	MaterialDao dao = new MaterialDao(manager);
	Material material = new Material();
	
	manager.getTransaction().begin();
	
		material = dao.buscaPorId(15);
	
		emPromocao.setDataInicioPromocao(Calendar.getInstance());
		emPromocao.setDataFimPromocao(Calendar.getInstance());
		emPromocao.setValor(new BigDecimal(200));
		emPromocao.setMaterial(material);
		
		emPromocaoDao.adiciona(emPromocao);
		
	manager.getTransaction().commit();
	manager.close();
	System.out.println("Inserindo Material em Promoção");
		
	
	}
	
}
