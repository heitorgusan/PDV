package com.pdv.model;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "tb_clientes")
public class ClienteModel {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) //Gerador automático de ids.
	private long idCliente;
	
	@NotNull
	@Size(min = 2, max = 15)
	private String nomeCliente;
	
	@Size(min =1 , max = 15)
	private String sobrenomeCliente;
	
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date dataCadastro = new java.sql.Date(System.currentTimeMillis());

	public long getIdCliente() {
		return idCliente;
	}


	public void setIdCliente(long idCliente) {
		this.idCliente = idCliente;
	}


	public String getNomeCliente() {
		return nomeCliente;
	}


	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}


	public String getSobrenomeCliente() {
		return sobrenomeCliente;
	}


	public void setSobrenomeCliente(String sobrenomeCliente) {
		this.sobrenomeCliente = sobrenomeCliente;
	}


	public Date getDataCadastro() {
		return dataCadastro;
	}


	public void setDataCadastro(Date dataCadastro) {
		this.dataCadastro = dataCadastro;
	}

}