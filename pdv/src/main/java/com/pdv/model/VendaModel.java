package com.pdv.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "tb_vendas")
public class VendaModel {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long idVenda;
	
	@ManyToOne
	@JoinColumn(name = "id_cliente_venda")
	private ClienteModel cliente;
	
	@ManyToOne
	@JoinColumn(name = "id_produto_venda")
	private ProdutoModel produtoId;
	
	private String nomeProduto;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date dataCadastro = new java.sql.Date(System.currentTimeMillis());

	public long getIdVenda() {
		return idVenda;
	}

	public void setIdVenda(long idVenda) {
		this.idVenda = idVenda;
	}

	public ClienteModel getCliente() {
		return cliente;
	}

	public void setCliente(ClienteModel cliente) {
		this.cliente = cliente;
	}

	public ProdutoModel getProdutoId() {
		return produtoId;
	}

	public void setProdutoId(ProdutoModel produtoId) {
		this.produtoId = produtoId;
	}

	public Date getDataCadastro() {
		return dataCadastro;
	}

	public void setDataCadastro(Date dataCadastro) {
		this.dataCadastro = dataCadastro;
	}

	public String getNomeProduto() {
		return nomeProduto;
	}

	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}
}