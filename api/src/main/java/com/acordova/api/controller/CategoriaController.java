package com.acordova.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.acordova.api.models.Categoria;
import com.acordova.api.service.IService;

@CrossOrigin(origins = "*", maxAge = 3600, methods= {RequestMethod.GET,RequestMethod.POST,RequestMethod.PUT,RequestMethod.DELETE})
@RestController
@RequestMapping({"/categoria"})
public class CategoriaController {
	@Autowired
	IService service;
	
	@GetMapping
	public List<Categoria> listar(){
		return service.listarCategoria();
	}
	@PostMapping
	public Categoria agregar(@RequestBody Categoria p) {
		return service.addCategoria(p);
	}
	
	@GetMapping("/{id}")
	public Categoria listarId(@PathVariable("id")String id){
		return service.listarIdCategoria(id);
	}
	@PutMapping
	public Categoria editar(@RequestBody Categoria p) {
		return service.editCategoria(p);
	}
	@DeleteMapping("/{id}")
	public Categoria delete(@PathVariable("id")String id) {
		return service.deleteCategoria(id);
	}
}
