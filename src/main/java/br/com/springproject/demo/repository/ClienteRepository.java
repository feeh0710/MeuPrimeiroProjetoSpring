package br.com.springproject.demo.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.springproject.demo.model.Cliente;
import br.com.springproject.demo.model.Produto;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long>{
	
}
