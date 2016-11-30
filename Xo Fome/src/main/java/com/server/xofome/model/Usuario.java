package com.server.xofome.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "usuario")
public class Usuario {

	@Id
	private String email;
	
	//@JsonIgnore
	
//	@OneToMany(mappedBy = "usuario")
	//@OneToMany(cascade = {CascadeType.MERGE, CascadeType.REMOVE})
//	private List<Pedido> pedidos;
	
//	public List<Pedido> getPedidos() {
//		return pedidos;
//	}

//	public void setPedidos(List<Pedido> pedidos) {
//		this.pedidos = pedidos;
//	}

	public Usuario() {
		
	}
	
	public Usuario(String email) {
		this.email = email;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
}
