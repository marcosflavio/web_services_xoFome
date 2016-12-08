package com.server.xofome.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.server.xofome.model.ItemPedido;
import com.server.xofome.model.Pedido;
import com.server.xofome.services.IPedidoService;

@RestController
@RequestMapping(value = "/pedidos")
public class PedidoController {

	@Autowired
	private IPedidoService service;

	// public List<Pedido> findAll();
	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<List<Pedido>> findAll() {
		List<Pedido> pedidoList = service.findAll();
		return new ResponseEntity<List<Pedido>>(pedidoList, HttpStatus.OK);
	}

	// public Pedido findOne( int id );
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public ResponseEntity<Pedido> findOne(@PathVariable(value = "id") int id) {
		Pedido pedido = service.findOne(id);
		return new ResponseEntity<Pedido>(pedido, HttpStatus.OK);
	}

	// public Pedido save( Pedido pedido );
	@RequestMapping(method = RequestMethod.POST)
	public ResponseEntity<Pedido> save(@RequestBody Pedido requestBuy) {
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>" + requestBuy.toString());
		Pedido pedido = service.save(requestBuy);
		return new ResponseEntity<Pedido>(pedido, HttpStatus.OK);
	}

	// public Pedido update( Pedido pedido );
	@RequestMapping(value = "/{id}", method = RequestMethod.PUT)
	public ResponseEntity<Pedido> update(@PathVariable(value = "id") int id, @RequestBody Pedido requestBuy) {
		Pedido pedido = service.update(requestBuy);
		return new ResponseEntity<Pedido>(pedido, HttpStatus.OK);
	}

	// public void delete( int id );
	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	public ResponseEntity<Void> delete(@PathVariable(value = "id") int id) {
		service.delete(id);
		return new ResponseEntity<Void>(HttpStatus.OK);
	}

	// public void setStatus( int id, String status );
	@RequestMapping(value = "/status/{id}/{status}", method = RequestMethod.GET)
	public ResponseEntity<Void> setStatus(@PathVariable(value = "id") int id,
			@PathVariable(value = "status") String status) {
		service.setStatus(id, status);
		return new ResponseEntity<Void>(HttpStatus.OK);
	}

	// public String getStatus( int id);
	@RequestMapping(value = "/status/{id}", method = RequestMethod.GET)
	public ResponseEntity<String> getStatus(@PathVariable(value = "id") int id) {
		String status = service.getStatus(id);
		return new ResponseEntity<String>(status, HttpStatus.OK);
	}

	// public List<ItemPedido> getItens ( int id );
	@RequestMapping(value = "/itensp/{id}", method = RequestMethod.GET)
	public ResponseEntity<List<ItemPedido>> getItens(@PathVariable(value = "id") int id) {
		
		List<ItemPedido> itens = service.getItens(id);
		return new ResponseEntity<List<ItemPedido>>(itens, HttpStatus.OK);
	}

	//public Pedido findPedidoByUserAndStatus( @Param("usuario") Usuario usuario,@Param("status") String status);
	@RequestMapping(value = "/{email}/{status}", method = RequestMethod.GET)
	public ResponseEntity<Pedido> findPedidoByUserAndStatus (@PathVariable(value = "email") String email, @PathVariable(value = "status") String status) {
		Pedido pedido = service.findPedidoByUserAndStatus(email, status);
		return new ResponseEntity<Pedido>(pedido, HttpStatus.OK);
	}
	
	@RequestMapping(value = "/findPedido/{email}", method = RequestMethod.GET)
	public ResponseEntity<List<Pedido>> findPedidoByUsuario (@PathVariable(value = "email") String email) {
		List<Pedido> pedidos = service.findPedidoByUsuario(email);
		return new ResponseEntity<List<Pedido>>(pedidos, HttpStatus.OK);
	}
}