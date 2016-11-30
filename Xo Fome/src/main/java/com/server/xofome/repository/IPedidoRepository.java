package com.server.xofome.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.server.xofome.model.ItemPedido;
import com.server.xofome.model.Pedido;
import com.server.xofome.model.Usuario;

public interface IPedidoRepository extends JpaRepository<Pedido, Integer> {
	
	@Modifying
	@Query("UPDATE Pedido SET status=:statusParam WHERE idPedido=:pedidoId")
	public void setStatus(@Param("pedidoId") int id, @Param("statusParam") String status);

	@Query("SELECT p.status FROM Pedido p WHERE p.idPedido=:pedidoId")
	public String getStatus(@Param("pedidoId") int id);

	@Query("SELECT p.endereco FROM Pedido p")
	public List<String> getEnderecos();

	@Query("SELECT p.endereco FROM Pedido p WHERE p.idPedido=:pedidoId")
	public String getEndereco(@Param("pedidoId") int id);
	
	@Query("SELECT p.itensPedido FROM Pedido p WHERE p.idPedido=:pedidoId")
	public List <ItemPedido> getItens( @Param("pedidoId") int id );
	
	@Query("SELECT p FROM Pedido p WHERE p.usuario.email=:emailP AND p.status=:statusP")
	public Pedido findPedidoByUsuarioAndStatus( @Param("emailP") String email, @Param("statusP") String status);
}
