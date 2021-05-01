package com.acordova.api.repository;

import java.util.List;

import org.springframework.data.repository.Repository;

import com.acordova.api.models.Producto;

public interface ProductoRepository extends Repository<Producto, String>{

	List<Producto> findAll();

	Producto findById(String id);

	Producto save(Producto p);

	void delete(Producto p);
}
