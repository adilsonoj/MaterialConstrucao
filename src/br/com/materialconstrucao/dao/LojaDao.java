package br.com.materialconstrucao.dao;

import java.util.List;

import javax.persistence.EntityManager;

import br.com.materialconstrucao.modelo.Loja;

public class LojaDao {
private EntityManager manager;
	
	public LojaDao(EntityManager manager){
		this.manager = manager;
	}
	
	public void adiciona(Loja loja){
		this.manager.persist(loja);
	}
	
	public void remove(Loja loja){
		Loja lojaParaRemover = this.manager.find(Loja.class, loja.getId());
		this.manager.remove(lojaParaRemover);
	}
	
	public Loja buscaPorId(Integer id){
		return this.manager.find(Loja.class, id);
	}
	
	public List<Loja> lista(){
		return this.manager.createQuery("select c from Conta c", Loja.class).getResultList();
	}
	
	public Loja altera(Loja loja){
		return this.manager.merge(loja);
	}
	
}
