package com.server.xofome.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.server.xofome.model.Produto;

public interface IProdutoRepository extends JpaRepository<Produto, Integer> {
	
	//Consulta JPQL pra retornar produtos de um dado tipo (comida ou bebida)
		@Query("SELECT p FROM Produto p WHERE p.tipo = ?") 
		public List<Produto> findByTipo(@Param("tipo") int tipo);	
}
