package com.randstad.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.randstad.model.Ordine;
import com.randstad.service.OrdineProdottoService;
import com.randstad.service.OrdineService;

/**
 * Rest controller di Ordine
 */

@RestController
@RequestMapping("/ordine")
public class OrdineController {
	
	@Autowired
	OrdineService oS;
	@Autowired
	OrdineProdottoService opS;
	
	@GetMapping
	List<Ordine> getAll(){
		return oS.getAll();
	}
	
	@GetMapping("/{id}")
	List<String[]> getOrdineID(@PathVariable Long id){
		return opS.getOrdineProdotto(id);
	}
	
	
}
