package com.server.xofome.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.server.xofome.model.Produto;
import com.server.xofome.services.IProdutoService;

@RestController
@RequestMapping(value = "/produtos")
public class ProdutoController {
//
	@Autowired
	private IProdutoService produtoService;

	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<List<Produto>> findAll() {

		List<Produto> produtoList = produtoService.findAll();

		return new ResponseEntity<List<Produto>>(produtoList, HttpStatus.OK);
	}
	
	@RequestMapping(value = "/count", method = RequestMethod.GET)
	public ResponseEntity<Long> getCount() {

		Long count = produtoService.getCount();

		return new ResponseEntity<Long>(count, HttpStatus.OK);
	}

	@RequestMapping(method = RequestMethod.POST)
	public ResponseEntity<Produto> save(@RequestBody Produto requestProduto) {
		Produto produto = produtoService.save(requestProduto);

		return new ResponseEntity<Produto>(produto, HttpStatus.OK);
	}

	// listar?tipo = tipo
	@RequestMapping(value = "/listar", method = RequestMethod.GET)
	public ResponseEntity<List<Produto>> findComidas(@RequestParam(value = "tipo") int tipo) {

		List<Produto> produtoList = produtoService.findByTipo(tipo);
		return new ResponseEntity<List<Produto>>(produtoList, HttpStatus.OK);
	}
	
	// public Pedido findOne( int id );
		@RequestMapping(value = "/update/{qtde}", method = RequestMethod.GET)
		public ResponseEntity<List<Produto>> findAllUpdate(@PathVariable(value = "qtde") int qtde) {
			List<Produto> produtos = produtoService.findAllUpdate(qtde);
			return new ResponseEntity<List<Produto>>(produtos, HttpStatus.OK);
		}
}
