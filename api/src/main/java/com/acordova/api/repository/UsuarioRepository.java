package com.acordova.api.repository;

import java.util.List;

import org.springframework.data.repository.Repository;

import com.acordova.api.models.Usuario;

public interface UsuarioRepository extends Repository<Usuario, String>{
	
	List<Usuario> findAll();

	Usuario findById(String id);

	Usuario save(Usuario p);

	void delete(Usuario p);
}
