package br.com.materialconstrucao.test;

import java.util.Calendar;

import javax.persistence.EntityManager;

import br.com.materialconstrucao.dao.LojaDao;
import br.com.materialconstrucao.modelo.Loja;
import br.com.materialconstrucao.util.JPAUtil;

public class testaInsereLoja {

	public static void main(String[] args) {

		EntityManager manager = new JPAUtil().getEntityManager();
		
		LojaDao dao = new LojaDao(manager);
		
		Loja loja = new Loja();
		
		loja.setCnpj("123456/2001");
		loja.setDataCadastro(Calendar.getInstance());
		loja.setEndereco("Av Rio branco, 218");
		loja.setNomeComercial("xpto");
		loja.setRazaoSocial("Comercio eletronico");
		loja.setTelefone("6548-3333");
		loja.setPatrocinada(true);
		
		manager.getTransaction().begin();
		dao.adiciona(loja);
		System.out.println("Inserindo Loja...");
		manager.getTransaction().commit();
		manager.close();
		

	}

}
