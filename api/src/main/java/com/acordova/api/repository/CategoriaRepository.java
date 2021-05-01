package com.acordova.api.repository;

import java.util.List;

import org.springframework.data.repository.Repository;

import com.acordova.api.models.Categoria;

public interface CategoriaRepository extends Repository<Categoria, String>{
	
	List<Categoria> findAll();

	Categoria findById(String id);

	Categoria save(Categoria p);

	void delete(Categoria p);
}
