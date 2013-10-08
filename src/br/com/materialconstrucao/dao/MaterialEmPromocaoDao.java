package br.com.materialconstrucao.dao;

import java.util.List;

import javax.persistence.EntityManager;

import br.com.materialconstrucao.modelo.MaterialEmPromocao;

public class MaterialEmPromocaoDao {
	
	private EntityManager manager;
	
	public MaterialEmPromocaoDao(EntityManager manager){
		this.manager = manager;
	}
	
	public void adiciona(MaterialEmPromocao emPromocao){
		this.manager.persist(emPromocao);
	}
	
	public void remove(MaterialEmPromocao emPromocao){
		this.manager.remove(emPromocao);
	}
	
	public MaterialEmPromocao buscaPorId(Integer id){
		return this.manager.find(MaterialEmPromocao.class, id);
	}
	
	public List<MaterialEmPromocao> lista(){
		return this.manager.createQuery("select c from Conta c", MaterialEmPromocao.class).getResultList();
	}
	
	public MaterialEmPromocao altera(MaterialEmPromocao emPromocao){
		return this.manager.merge(emPromocao);
	}
}
