package br.com.springproject.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.springproject.demo.model.Endereco;
import br.com.springproject.demo.model.Produto;

@Repository
public interface EnderecoRepository extends JpaRepository<Endereco, Long>{
	
}
