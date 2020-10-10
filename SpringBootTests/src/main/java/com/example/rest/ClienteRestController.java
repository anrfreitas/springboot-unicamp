package com.example.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.entities.Cliente;
import com.example.repositories.ClienteRepository;

@RestController
@RequestMapping("/api")
public class ClienteRestController {

	@Autowired
	private ClienteRepository repository;
	
	@DeleteMapping("/cliente/{id}")
	public void deletar(@PathVariable(value="id") long id) {
		repository.deleteById(id);
		/* alternative method */
		//It will return the entity, right? Then we pass it as parameter to delete (entity)
		//repository.delete(repository.findById(id));
	}
	
	@PostMapping("/cliente")
	public Cliente inserir(@RequestBody Cliente cliente) {
		return repository.save(cliente);
	}
	
	@PutMapping("/cliente")
	public Cliente atualizar(@RequestBody Cliente cliente) {
		return repository.save(cliente);
	}
	
	@GetMapping("/cliente")
	public List<Cliente> listar() {
		return repository.findAll();
	}
	
	@GetMapping("/cliente/{id}")
	public Cliente obter(@PathVariable(value="id") long id) {
		return repository.findById(id);
	}
}
