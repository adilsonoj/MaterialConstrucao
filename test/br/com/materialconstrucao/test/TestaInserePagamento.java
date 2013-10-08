package br.com.materialconstrucao.test;

import java.math.BigDecimal;
import java.util.Calendar;

import javax.persistence.EntityManager;

import br.com.materialconstrucao.dao.LojaDao;
import br.com.materialconstrucao.dao.PagamentoLojaPatrocinadaDao;
import br.com.materialconstrucao.modelo.Loja;
import br.com.materialconstrucao.modelo.PagamentoLojaPatrocinada;
import br.com.materialconstrucao.modelo.TipoPagamento;
import br.com.materialconstrucao.util.JPAUtil;

public class TestaInserePagamento {
	public static void main(String[] args) {
		EntityManager manager = new JPAUtil().getEntityManager();
		
		//Loja loja = new Loja();
		LojaDao lojaDao = new LojaDao(manager);
		
		PagamentoLojaPatrocinada pagamento = new PagamentoLojaPatrocinada();
		PagamentoLojaPatrocinadaDao pagamentoDao = new PagamentoLojaPatrocinadaDao(manager);
				
		
		manager.getTransaction().begin();
		
			Loja loja = lojaDao.buscaPorId(3);
		
			pagamento.setData(Calendar.getInstance());
			pagamento.setTipoPagamento(TipoPagamento.ANUAL);
			pagamento.setValor(new BigDecimal(1000));
			pagamento.setLoja(loja);
			
			pagamentoDao.adiciona(pagamento);
			
		manager.getTransaction().commit();
		manager.close();
		System.out.println("Inserindo Pagamento");
			
		
		}
}
