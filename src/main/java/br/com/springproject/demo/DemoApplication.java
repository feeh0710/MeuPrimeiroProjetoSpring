package br.com.springproject.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.com.springproject.demo.model.Produto;
import br.com.springproject.demo.service.ProdutoService;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {
	@Autowired
	ProdutoService produtoService;
	
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Produto produto = new Produto("Bulacha",250);
		produtoService.create(produto);//cadastra produto 
	}

}
