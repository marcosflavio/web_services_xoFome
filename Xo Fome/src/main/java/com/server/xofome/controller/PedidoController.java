package com.server.xofome.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.server.xofome.services.IItemPedidoService;

@RestController
@RequestMapping(value = "/pedidos")
public class PedidoController {
	
	@Autowired
	private IItemPedidoService service;
	
//	public List<Pedido> findAll();
	
	
//	public Pedido findOne( int id );

	
	
//	public Pedido save( Pedido pedido );

//	public Pedido update( Pedido pedido );

//	public void delete( int id );
	
//	public void setStatus( int id, String status );
	
//	public String getStatus( int id);
	
//	public List<String> getEnderecos();
	
//	public String getEndereco( int id );
	
//	public List<ItemPedido> getItens ( int id );
}