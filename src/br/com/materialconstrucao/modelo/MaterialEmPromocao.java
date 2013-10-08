package br.com.materialconstrucao.modelo;

import java.math.BigDecimal;
import java.util.Calendar;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class MaterialEmPromocao {
	@Id
	@GeneratedValue
	private Integer id;
	private BigDecimal valor;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Calendar dataInicioPromocao;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Calendar dataFimPromocao;
		
	@ManyToOne
	private Material material;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public BigDecimal getValor() {
		return valor;
	}

	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}

	public Calendar getDataInicioPromocao() {
		return dataInicioPromocao;
	}

	public void setDataInicioPromocao(Calendar dataInicioPromocao) {
		this.dataInicioPromocao = dataInicioPromocao;
	}

	public Calendar getDataFimPromocao() {
		return dataFimPromocao;
	}

	public void setDataFimPromocao(Calendar dataFimPromocao) {
		this.dataFimPromocao = dataFimPromocao;
	}

	public Material getMaterial() {
		return material;
	}

	public void setMaterial(Material material) {
		this.material = material;
	}
	
	
}
