package com.api.excecoes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ExcecoesApplication {

	public static void main(String[] args) {
		SpringApplication.run(ExcecoesApplication.class, args);

		Exercicio.ex1();
	}

}
