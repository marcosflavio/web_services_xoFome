package com.server.xofome.repository;

import java.util.List;

import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.server.xofome.model.Produto;

public interface IProdutoRepository extends JpaRepository<Produto, Integer> {
	// Consulta JPQL pra retornar produtos de um dado tipo (comida ou bebida)
	@Query("SELECT p FROM Produto p WHERE p.tipo=:tipo")
	public List<Produto> findByTipo(@Param("tipo") int tipo);

	@Query("SELECT count(*) FROM Produto")
	public Long getCount();
	
	// Consulta JPQL pra retornar os produtos do banco
	@Query("SELECT p FROM Produto p ORDER BY p.idProduto DESC")
	public List<Produto> findAllUpdate( Pageable pageable);

	default List<Produto> findUpdateQTDE(int qtde) {
		
		return findAllUpdate(new PageRequest(0, qtde));
	}

}
