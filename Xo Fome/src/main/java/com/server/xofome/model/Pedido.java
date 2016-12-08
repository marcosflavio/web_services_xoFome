package com.server.xofome.model;


import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@Table(name = "pedido")
public class Pedido {
	
	@Override
	public String toString() {
		return "Pedido [idPedido=" + idPedido + ", usuario=" + usuario + ", status=" + status + ", valorTotalPedido="
				+ valorTotalPedido + ", valorASerPago=" + valorASerPago + "]";
	}

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int idPedido;
	
	@ManyToOne(cascade = {CascadeType.MERGE})
	@JoinColumn(name = "email")
	private Usuario usuario;
	
	@JsonProperty(value = "status")
	@Column(name = "status")
	private String status = "Inativo";
	
	@JsonProperty(value = "valorTotalPedido")
	@Column(name = "valor_total_pedido")
	private double valorTotalPedido;

	@JsonProperty(value = "longitude")
	@Column(name = "longitude")
	private String longitude;

	@JsonProperty(value = "latitude")
	@Column(name = "latitude")
	private String latitude;
	
	@JsonProperty(value = "valorASerPago")
	@Column(name = "valor_a_ser_pago")
	private double valorASerPago;

	public Pedido() {
		//idPedido++;
	}

//	public List<ItemPedido> getItensPedido() {
//		return itensPedido;
//	}
//
//	public void setItensPedido(List<ItemPedido> itensPedido) {
//		this.itensPedido = itensPedido;
//	}

	public double getValorASerPago() {
		return valorASerPago;
	}

	public void setValorASerPago(double valorASerPago) {
		this.valorASerPago = valorASerPago;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public int getIdPedido() {
		return idPedido;
	}

	public void setIdPedido(int idPedido) {
		this.idPedido = idPedido;
	}

	public double getValorTotalPedido() {
		return valorTotalPedido;
	}

	public void setValorTotalPedido(double valorTotalPedido) {
		this.valorTotalPedido = valorTotalPedido;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public String getLongitude() {
		return longitude;
	}

	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}

	public String getLatitude() {
		return latitude;
	}

	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (!(o instanceof Pedido))
			return false;

		Pedido pedido = (Pedido) o;

		return idPedido == pedido.idPedido;
	}

	@Override
	public int hashCode() {
		return idPedido;
	}

}
