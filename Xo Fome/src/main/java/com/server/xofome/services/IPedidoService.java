package com.server.xofome.services;

import java.util.List;

import com.server.xofome.model.ItemPedido;
import com.server.xofome.model.Pedido;

public interface IPedidoService {

	public List<Pedido> findAll();

	public Pedido findOne( int id );

	public Pedido save( Pedido pedido );

	public Pedido update( Pedido pedido );

	public void delete( int id );
	
	public void setStatus( int id, String status );
	
	public String getStatus( int id);
	
	public List<ItemPedido> getItens ( int id );
	
	public Pedido findPedidoByUserAndStatus( String email, String status);
	
	public List<Pedido> findPedidoByUsuario( String email);
}
