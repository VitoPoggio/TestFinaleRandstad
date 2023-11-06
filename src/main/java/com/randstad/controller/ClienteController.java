package com.randstad.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.randstad.model.Cliente;
import com.randstad.model.Ordine;
import com.randstad.service.ClienteService;
import com.randstad.service.OrdineService;

/**
 * Rest controller del Cliente
 */
@RestController
@RequestMapping("/cliente")
public class ClienteController {

	@Autowired
	ClienteService cS;
	@Autowired
	OrdineService oS;
	
	@GetMapping
	List<Cliente> getAll(){
		return cS.getAll();
	}
	
	@GetMapping("/{id}")
	Optional<Cliente> getById(@PathVariable Long id){
		return cS.findById(id);
	}
	
	@PostMapping
	Cliente saveCliente(@RequestBody Cliente c){
		return cS.saveCliente(c);
	}
	
	@GetMapping("/{id}/ordini")
	List<Ordine> getOrdiniEffettuati(@PathVariable Long id){
		return oS.findByUtente(id);
	}
	
	@DeleteMapping("/{id}")
	void deleteCliente(@PathVariable Long id) {
		cS.deleteCliente(cS.findById(id).get());
	}
}
