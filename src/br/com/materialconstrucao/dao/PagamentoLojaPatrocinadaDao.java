package br.com.materialconstrucao.dao;

import java.util.List;

import javax.persistence.EntityManager;

import br.com.materialconstrucao.modelo.PagamentoLojaPatrocinada;

public class PagamentoLojaPatrocinadaDao {
private EntityManager manager;
	
	public PagamentoLojaPatrocinadaDao(EntityManager manager){
		this.manager = manager;
	}
	
	public void adiciona(PagamentoLojaPatrocinada pagamento){
		
		this.manager.persist(pagamento);
	}
	
	public void remove(PagamentoLojaPatrocinada pagamento){
		this.manager.remove(pagamento);
	}
	
	public PagamentoLojaPatrocinada buscaPorId(Integer id){
		return this.manager.find(PagamentoLojaPatrocinada.class, id);
	}
	
	public List<PagamentoLojaPatrocinada> lista(){
		return this.manager.createQuery("select c from Conta c", PagamentoLojaPatrocinada.class).getResultList();
	}
	
	public PagamentoLojaPatrocinada altera(PagamentoLojaPatrocinada pagamento){
		return this.manager.merge(pagamento);
	}
}
