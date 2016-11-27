package com.server.xofome.services;

import java.util.List;

import com.server.xofome.model.Produto;

public interface IProdutoService {

	public List<Produto> findAll();

	public Produto findOne(int id);

	public Produto save(Produto produto);

	public Produto update(Produto produto);

	public void delete(int id);
	
	public List<Produto>findByTipo(int tipo);
	
	public Long getCount();
	
	public List<Produto> findAllUpdate( int qtde);
}
