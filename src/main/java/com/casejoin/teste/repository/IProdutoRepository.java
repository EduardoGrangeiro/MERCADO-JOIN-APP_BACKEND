package com.casejoin.teste.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.casejoin.teste.model.Produto;

public interface IProdutoRepository extends JpaRepository<Produto, Long>{
	
	List<Produto> findByCategoriaId(Long categoriaId);

}
