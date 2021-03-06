package com.server.xofome.services;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.server.xofome.model.ItemPedido;
import com.server.xofome.model.Pedido;
import com.server.xofome.model.Produto;
import com.server.xofome.repository.IItempedidoRepository;
import com.server.xofome.repository.IPedidoRepository;

@Transactional
@Service
public class ItemPedidoService implements IItemPedidoService {

	@Autowired
	private IItempedidoRepository repository;
	
	@Autowired
	private IPedidoRepository repositoryPedido;
	
	@Override
	public List<ItemPedido> findAll() {
		return repository.findAll();
	}

	@Override
	public ItemPedido findOne(int id) {
		return repository.findOne(id);
	}
	
	@Override
	public ItemPedido save(ItemPedido itemPedido) {
		
		Pedido pedido1 = itemPedido.getPedido();
		
		pedido1 = repositoryPedido.findOne(pedido1.getIdPedido());
		pedido1.setStatus("Recebido");
		itemPedido.setPedido(pedido1);
		
		return repository.save(itemPedido);
		
	}

	@Override
	public ItemPedido update(ItemPedido itemPedido) {
		return repository.save(itemPedido);
	}

	@Override
	public void delete(int id) {
		repository.delete(id);
	}

	@Override
	public Produto findProduct(int id) {
		return repository.findProduct(id);
	}
}