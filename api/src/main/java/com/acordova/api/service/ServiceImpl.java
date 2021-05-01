package com.acordova.api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.acordova.api.models.Categoria;
import com.acordova.api.models.Cliente;
import com.acordova.api.models.Producto;
import com.acordova.api.models.Usuario;
import com.acordova.api.repository.CategoriaRepository;
import com.acordova.api.repository.ClienteRepository;
import com.acordova.api.repository.ProductoRepository;
import com.acordova.api.repository.UsuarioRepository;

@Service
public class ServiceImpl implements IService{

	@Autowired
	private ClienteRepository clienteRepository;
	
	@Override
	public List<Cliente> listarCliente() {
		return clienteRepository.findAll();
	}

	@Override
	public Cliente listarIdCliente(String id) {
		return clienteRepository.findById(id);
	}

	@Override
	public Cliente addCliente(Cliente u) {
		return clienteRepository.save(u);
	}

	@Override
	public Cliente editCliente(Cliente u) {
		return clienteRepository.save(u);
	}

	@Override
	public Cliente deleteCliente(String id) {
		Cliente agente = listarIdCliente(id);
		clienteRepository.delete(agente);
		return agente;
	}
	
	@Autowired
	private ProductoRepository productoRepository;
	
	@Override
	public List<Producto> listarProducto() {
		return productoRepository.findAll();
	}

	@Override
	public Producto listarIdProducto(String id) {
		return productoRepository.findById(id);
	}

	@Override
	public Producto addProducto(Producto u) {
		return productoRepository.save(u);
	}

	@Override
	public Producto editProducto(Producto u) {
		return productoRepository.save(u);
	}

	@Override
	public Producto deleteProducto(String id) {
		Producto agente = listarIdProducto(id);
		productoRepository.delete(agente);
		return agente;
	}
	
	@Autowired
	private UsuarioRepository usuarioRepository;
	
	@Override
	public List<Usuario> listarUsuario() {
		return usuarioRepository.findAll();
	}

	@Override
	public Usuario listarIdUsuario(String id) {
		return usuarioRepository.findById(id);
	}

	@Override
	public Usuario addUsuario(Usuario u) {
		return usuarioRepository.save(u);
	}

	@Override
	public Usuario editUsuario(Usuario u) {
		return usuarioRepository.save(u);
	}

	@Override
	public Usuario deleteUsuario(String id) {
		Usuario agente = listarIdUsuario(id);
		usuarioRepository.delete(agente);
		return agente;
	}
	
	
	@Autowired
	private CategoriaRepository categoriaRepository;
	
	@Override
	public List<Categoria> listarCategoria() {
		return categoriaRepository.findAll();
	}

	@Override
	public Categoria listarIdCategoria(String id) {
		return categoriaRepository.findById(id);
	}

	@Override
	public Categoria addCategoria(Categoria u) {
		return categoriaRepository.save(u);
	}

	@Override
	public Categoria editCategoria(Categoria u) {
		return categoriaRepository.save(u);
	}

	@Override
	public Categoria deleteCategoria(String id) {
		Categoria agente = listarIdCategoria(id);
		categoriaRepository.delete(agente);
		return agente;
	}
}
