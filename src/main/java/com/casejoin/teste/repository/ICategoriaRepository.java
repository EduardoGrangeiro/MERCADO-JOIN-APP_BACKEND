package com.casejoin.teste.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.casejoin.teste.model.Categoria;

public interface ICategoriaRepository extends JpaRepository<Categoria, Long>{
	
	 boolean existsByNome(String nome);

}
