package com.server.xofome.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@Table(name = "pedido")
public class Pedido {
	
	@Id
	@GeneratedValue
	private int idPedido;
	
	@OneToMany(mappedBy = "idPedido")
	private List<ItemPedido> itensPedido;
	
	@JsonProperty(value = "status")
	@Column(name = "status")
	private String status = "Inativo";
	
	@JsonProperty(value = "valorTotalPedido")
	@Column(name = "valor_total_pedido")
	private double valorTotalPedido;

	@JsonProperty(value = "endereco")
	@Column(name = "endereco")
	private String endereco;
	
	@JsonProperty(value = "valorASerPago")
	@Column(name = "valor_a_ser_pago")
	private double valorASerPago;

	public Pedido() {
		this.itensPedido = new ArrayList<ItemPedido>();
		idPedido++;
	}

	public List<ItemPedido> getItensPedido() {
		return itensPedido;
	}

	public void setItensPedido(List<ItemPedido> itensPedido) {
		this.itensPedido = itensPedido;
	}

	public double getValorASerPago() {
		return valorASerPago;
	}

	public void setValorASerPago(double valorASerPago) {
		this.valorASerPago = valorASerPago;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
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

		double valorTotal = 0;

		for (ItemPedido i : itensPedido) {
			valorTotal += i.getValor();
		}
		valorTotalPedido = valorTotal;
		return valorTotalPedido;
	}

	public void setValorTotalPedido(double valorTotalPedido) {
		this.valorTotalPedido = valorTotalPedido;
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
