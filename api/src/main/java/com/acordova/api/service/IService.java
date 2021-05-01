package com.acordova.api.service;

import java.util.List;

import com.acordova.api.models.Categoria;
import com.acordova.api.models.Cliente;
import com.acordova.api.models.Producto;
import com.acordova.api.models.Usuario;

public interface IService {
	List<Cliente> listarCliente();

	Cliente listarIdCliente(String id);

	Cliente addCliente(Cliente u);

	Cliente editCliente(Cliente u);

	Cliente deleteCliente(String id);
	
	List<Producto> listarProducto();

	Producto listarIdProducto(String id);

	Producto addProducto(Producto u);

	Producto editProducto(Producto u);

	Producto deleteProducto(String id);
	
	List<Usuario> listarUsuario();

	Usuario listarIdUsuario(String id);

	Usuario addUsuario(Usuario u);

	Usuario editUsuario(Usuario u);

	Usuario deleteUsuario(String id);
	
	List<Categoria> listarCategoria();

	Categoria listarIdCategoria(String id);

	Categoria addCategoria(Categoria u);

	Categoria editCategoria(Categoria u);

	Categoria deleteCategoria(String id);
}
