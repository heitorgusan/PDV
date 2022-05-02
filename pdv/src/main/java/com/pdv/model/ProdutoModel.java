package com.pdv.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "tb_produtos")

public class ProdutoModel {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long idProduto;
	
	@NotNull
	@Size(min = 3 , max = 30)
	private String nomeProduto;
	
	@NotNull
	private double precoVendaProduto;
	
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date dataCadastroProduto = new java.sql.Date(System.currentTimeMillis());
	

	public long getIdProduto() {
		return idProduto;
	}

	public void setIdProduto(long idProduto) {
		this.idProduto = idProduto;
	}

	public String getNomeProduto() {
		return nomeProduto;
	}

	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}

	public double getPrecoVendaProduto() {
		return precoVendaProduto;
	}

	public void setPrecoVendaProduto(double precoVendaProduto) {
		this.precoVendaProduto = precoVendaProduto;
	}
	
}