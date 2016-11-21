package com.server.xofome.services;

import java.util.List;

import com.server.xofome.model.ItemPedido;
import com.server.xofome.model.Produto;

public interface IItemPedidoService {
	
	public List<ItemPedido> findAll();

	public ItemPedido findOne(int id);

	public ItemPedido save(ItemPedido itemPedido);

	public ItemPedido update(ItemPedido itemPedido);

	public void delete(int id);

	public Produto findProduct(int id);
}
