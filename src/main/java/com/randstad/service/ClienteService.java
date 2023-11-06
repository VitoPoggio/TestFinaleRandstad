package com.randstad.service;

import java.util.List;
import java.util.Optional;

import com.randstad.model.Cliente;

/**
 * Interfaccia ClienteService che contiene tutti i metodi da dover implementare in ServiceImpl
 */
public interface ClienteService {
	Cliente saveCliente(Cliente cliente);
	List<Cliente> getAll();
	Optional<Cliente> findByEmail(String email);
	Optional<Cliente> findById(Long id);
	void deleteCliente(Cliente cliente);
}
