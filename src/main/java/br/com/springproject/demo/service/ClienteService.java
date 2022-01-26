package br.com.springproject.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.springproject.demo.model.Cliente;
import br.com.springproject.demo.repository.ClienteRepository;

@Service
public class ClienteService {
	@Autowired
	private ClienteRepository clienteRepository;
	
	public Cliente create(Cliente cliente) {
		return clienteRepository.save(cliente);
	}
}
