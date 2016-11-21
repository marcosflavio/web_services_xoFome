package com.server.xofome.services;

import java.util.List;

import com.server.xofome.model.Pedido;

public interface IPedidoService {

	public List<Pedido> findAll();

	public Pedido findOne( int id );

	public Pedido save( Pedido pedido );

	public Pedido update( Pedido pedido );

	public void delete( int id );
	
	public void setStatus( int id, String status );
	
	public String getStatus( int id);
	
	public List<String> getEnderecos();
	
	public String getEndereco( int id );
}
