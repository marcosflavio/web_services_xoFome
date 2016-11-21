package com.server.xofome.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import com.server.xofome.model.ItemPedido;
import com.server.xofome.model.Produto;

public interface IItempedidoRepository extends JpaRepository<ItemPedido, Integer>{
	
	@Query("SELECT p FROM Produto p, ItemPedido it WHERE it.idProduto=: produtoId") 
	public Produto findProduct( @Param("produtoId") int idProduto);
}
