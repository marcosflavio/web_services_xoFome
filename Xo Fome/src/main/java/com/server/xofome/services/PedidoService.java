package com.server.xofome.services;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.server.xofome.model.ItemPedido;
import com.server.xofome.model.Pedido;
import com.server.xofome.repository.IPedidoRepository;

@Transactional
@Service
public class PedidoService implements IPedidoService {

	@Autowired
	private IPedidoRepository repository;
	
	@Override
	public List<Pedido> findAll() {
		return repository.findAll();
	}

	@Override
	public Pedido findOne(int id) {
		return repository.findOne(id);
	}

	@Override
	public Pedido save(Pedido pedido) {
		
		Pedido pedidoo = repository.findOne(pedido.getIdPedido());
		
		if(pedidoo != null){
			
			return pedidoo;
		}
			
		return repository.save(pedido);
	}

	@Override
	public Pedido update(Pedido pedido) {
		return repository.save(pedido);
	}

	@Override
	public void delete(int id) {
		repository.delete(id);
	}

	@Override
	public void setStatus(int id, String status) {
		repository.setStatus(id, status);
	}

	@Override
	public String getStatus(int id) {
		return repository.getStatus(id);
	}

	@Override
	public List<String> getEnderecos() {
		return repository.getEnderecos();
	}

	@Override
	public String getEndereco(int id) {
		return repository.getEndereco(id);
	}
	
	@Override
	public List<ItemPedido> getItens ( int id ){
		
		return repository.getItens( id );
	}
	
	@Override
	public Pedido findPedidoByUserAndStatus( String email, String status){
		
		return repository.findPedidoByUsuarioAndStatus(email, status);
	}
	
	@Override
	public List<Pedido> findPedidoByUsuario( String email){
		return repository.findPedidoByUsuario(email);
	}
}
