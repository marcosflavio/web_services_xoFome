package com.server.xofome.services;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.server.xofome.model.Produto;
import com.server.xofome.repository.IProdutoRepository;

@Transactional
@Service
public class ProdutoService implements IProdutoService{
	
	@Autowired
	private IProdutoRepository produtoRepository;
	
	@Override
	public List<Produto> findAll() {
		return produtoRepository.findAll();
	}

	@Override
	public Produto findOne(int id) {
		return produtoRepository.findOne(id);
	}

	@Override
	public Produto save(Produto produto) {
		return produtoRepository.save(produto);
	}

	@Override
	public Produto update(Produto produto) {
		
		return produtoRepository.save(produto);
	}

	@Override
	public void delete(int id) {
		produtoRepository.delete(id);
	}
	@Override
	public List<Produto>findByTipo(int tipo){
		return produtoRepository.findByTipo(tipo);
	}
		
}
