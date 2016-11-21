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
import com.server.xofome.model.ItemPedido;
import com.server.xofome.model.Produto;
import com.server.xofome.services.IItemPedidoService;

@RestController
@RequestMapping(value = "/item")
public class ItemPedidoController {

	@Autowired
	private IItemPedidoService service;
 
	// public List<ItemPedido> findAll();
	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<List<ItemPedido>> findAll() {
		List<ItemPedido> itemPedidoList = service.findAll();
		return new ResponseEntity<List<ItemPedido>>(itemPedidoList, HttpStatus.OK);
	}

	// public ItemPedido findOne(int id);
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public ResponseEntity<ItemPedido> findOne(@PathVariable(value = "id") int id) {
		ItemPedido item = service.findOne(id);
		return new ResponseEntity<ItemPedido>(item, HttpStatus.OK);
	}

	// public ItemPedido save(ItemPedido itemPedido);
	@RequestMapping(method = RequestMethod.POST)
	public ResponseEntity<ItemPedido> save(@RequestBody ItemPedido requestBuy) {
		ItemPedido item = service.save(requestBuy);
		return new ResponseEntity<ItemPedido>(item, HttpStatus.OK);
	}

	// public ItemPedido update(ItemPedido itemPedido);
	@RequestMapping(value = "/{id}", method = RequestMethod.PUT)
	public ResponseEntity<ItemPedido> update(@PathVariable(value = "id") int id, @RequestBody ItemPedido requestBuy) {
		ItemPedido item = service.update(requestBuy);
		return new ResponseEntity<ItemPedido>(item, HttpStatus.OK);
	}

	// public void delete(int id);
	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	public ResponseEntity<Void> delete(@PathVariable(value = "id") int id) {
		service.delete(id);
		return new ResponseEntity<Void>(HttpStatus.OK);
	}

	// public Produto findProduct(int id);
	// item?id = name
	@RequestMapping(value = "/item", method = RequestMethod.GET)
	public ResponseEntity<Produto> findProduct(@RequestParam(value = "id") int id) {
		Produto produto = service.findProduct(id);
		return new ResponseEntity<Produto>(produto, HttpStatus.OK);
	}
}