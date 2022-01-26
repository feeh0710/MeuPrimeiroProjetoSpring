package br.com.springproject.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.springproject.demo.model.Produto;
import br.com.springproject.demo.repository.ProdutoRepository;

@Service
public class ProdutoService {
	@Autowired
	private ProdutoRepository produtoRepository;
	
	public Produto create(Produto produto) {
		return produtoRepository.save(produto);
	}
}
