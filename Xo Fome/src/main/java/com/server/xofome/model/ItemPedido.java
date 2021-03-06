package com.server.xofome.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@Table(name = "item_pedido")
public class ItemPedido {
	
	public ItemPedido() {
		
	}
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int idItemPedido;
	
	@ManyToOne(cascade = {CascadeType.ALL})
	@JoinColumn(name = "idPedido")
	private Pedido pedido;
	
	@OneToOne(optional = true)
	@JoinColumn(name = "idProduto")
	private Produto produto;
	
	@JsonProperty(value = "nomeProduto")
	@Column(name = "nome_produto")
	private String nomeProduto;
	
	@JsonProperty(value = "quantidade")
	@Column(name = "quantidade")
	private int quantidade;
	
	@JsonProperty(value = "valor")
	@Column(name = "valor")
	private double valor;


	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public int getIdItemPedido() {
		return idItemPedido;
	}

	public void setIdItemPedido(int idItemPedido) {
		this.idItemPedido = idItemPedido;
	}

	public String getNomeProduto() {
		return nomeProduto;
	}

	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public Pedido getPedido() {
		return pedido;
	}

	public void setPedido(Pedido pedido) {
		this.pedido = pedido;
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	@Override
	public String toString() {
		return "ItemPedido [idItemPedido=" + idItemPedido + ", pedido=" + pedido + ", produto=" + produto
				+ ", nomeProduto=" + nomeProduto + ", quantidade=" + quantidade + ", valor=" + valor + "]";
	}
	
	
}