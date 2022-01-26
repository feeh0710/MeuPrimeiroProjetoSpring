package br.com.springproject.demo;

import java.util.Arrays;
import java.util.Calendar;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.com.springproject.demo.model.Cliente;
import br.com.springproject.demo.model.Endereco;
import br.com.springproject.demo.model.Produto;
import br.com.springproject.demo.service.ClienteService;
import br.com.springproject.demo.service.EnderecoService;
import br.com.springproject.demo.service.ProdutoService;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {
	@Autowired
	ProdutoService produtoService;

	@Autowired
	ClienteService clienteService;

	@Autowired
	EnderecoService enderecoService;

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Produto produto = new Produto("Bulacha", 250);
		Produto produto2 = new Produto("Pão", 25);
		Produto produto3 = new Produto("Café", 3);

		Endereco endereco = new Endereco("Rua dos bobos", "bairro do sem bairro", "Cesário Longe");

		Calendar dataNascimento = Calendar.getInstance();
		dataNascimento.set(1993, 10, 7);
		
		Cliente cliente = new Cliente("Jusé", "ze@ze.com", dataNascimento, endereco,
				Arrays.asList(produto, produto2, produto3));// cria lista 
		
		produto.setCliente(cliente);
		produto2.setCliente(cliente);
		produto3.setCliente(cliente);
		
		clienteService.create(cliente);

	}

}
