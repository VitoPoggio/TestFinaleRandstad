package com.randstad.ServiceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.randstad.model.Cliente;
import com.randstad.repository.ClienteRepository;
import com.randstad.service.ClienteService;

@Service
public class ClienteServiceImpl implements ClienteService {

	@Autowired
	ClienteRepository cR;

	@Override
	public Cliente saveCliente(Cliente cliente) {
		return cR.save(cliente);
	}

	@Override
	public List<Cliente> getAll() {
		return cR.findAll();
	}

	@Override
	public Optional<Cliente> findByEmail(String email) {
		return cR.getByEmail(email);
	}

	@Override
	public Optional<Cliente> findById(Long id) {
		return cR.findById(id);
	}

	@Override
	public void deleteCliente(Cliente cliente) {
		cR.delete(cliente);
	}
}
