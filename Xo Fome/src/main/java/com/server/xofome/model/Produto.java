package com.server.xofome.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@Table(name = "produto")
public class Produto {
	
	@Id
	@GeneratedValue
	private int idProduto;
	
	@JsonProperty(value = "nomeProduto")
	@Column(name = "nomeProduto")
    private String nomeProduto;
	
	@JsonProperty(value = "preco")
	@Column(name = "preco")
    private Float preco;
	
	@JsonProperty(value = "descricao")
	@Column(name = "descricao")
    private String descricao;
	
	@JsonProperty(value = "tipo")
	@Column(name = "tipo")
    private int tipo;

    public Produto(String nome, Float preco, String descricao, int tipo) {
    	super();
        this.nomeProduto = nome;
        this.preco = preco;
        this.descricao = descricao;
        this.tipo = tipo;
    }

    public Produto() {
    	super();
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(int idProduto) {
        this.idProduto = idProduto;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public Float getPreco() {
        return preco;
    }

    public void setPreco(Float preco) {
        this.preco = preco;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }
	
	

}
