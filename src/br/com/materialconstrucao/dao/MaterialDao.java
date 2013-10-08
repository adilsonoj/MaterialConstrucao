package br.com.materialconstrucao.dao;

import java.util.List;

import javax.persistence.EntityManager;

import br.com.materialconstrucao.modelo.Material;

public class MaterialDao {
	
	private EntityManager manager;
	
	public MaterialDao(EntityManager manager){
		this.manager = manager;
	}
	
	public void adiciona(Material material){
		this.manager.persist(material);
	}
	
	public void remove(Material material){
		this.manager.remove(material);
	}
	
	public Material buscaPorId(Integer id){
		return this.manager.find(Material.class, id);
	}
	
	public List<Material> lista(){
		return this.manager.createQuery("select c from Conta c", Material.class).getResultList();
	}
	
	public Material altera(Material material){
		return this.manager.merge(material);
	}
	
}
