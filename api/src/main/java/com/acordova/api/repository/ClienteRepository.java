package com.acordova.api.repository;

import java.util.List;

import org.springframework.data.repository.Repository;

import com.acordova.api.models.Cliente;

public interface ClienteRepository extends Repository<Cliente, String> {

	List<Cliente> findAll();

	Cliente findById(String id);

	Cliente save(Cliente p);

	void delete(Cliente p);
}
