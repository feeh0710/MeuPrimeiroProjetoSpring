package br.com.springproject.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.springproject.demo.model.Endereco;
import br.com.springproject.demo.repository.EnderecoRepository;

@Service
public class EnderecoService {
	@Autowired
	private EnderecoRepository enderecoRepository;
	
	public Endereco create(Endereco endereco) {
		return enderecoRepository.save(endereco);
	}
}
