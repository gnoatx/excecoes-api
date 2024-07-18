package com.api.excecoes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.InputMismatchException;
import java.util.Scanner;

@SpringBootApplication
public class ExcecoesApplication {

	public static void main(String[] args) {
		SpringApplication.run(ExcecoesApplication.class, args);
		clearConsole();

		Scanner scInt = new Scanner(System.in);
		int input;
		boolean continua = true;

		while (continua) {
			System.out.print(
				"===== Menu =====\n" +
				"Digite uma opção.\n" +
				"1. ArithmeticException\n" +
				"2. InputMismatchException\n" +
				"3. ArrayIndexOutOfBoundsException\n" +
				"4. Sair\n" +
				"\n" +
				"Opção: "
			);
	
			try {
				input = scInt.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("Erro: Este campo apenas aceita números inteiros.");
				continue;
			}

			switch (input) {
				case 1:
					Exercicio.ex1();
					break;
				case 2:
					Exercicio.ex2();
					break;
				case 3:
					Exercicio.ex3();
					break;
				case 4:
					continua = false;
					break;
				default:
					System.out.println("Opção inválida.");
					break;
			}
		}

		System.out.println("Saindo do programa.");
		scInt.close();
	}

	static void clearConsole() {
        try {
            if (System.getProperty("os.name").contains("Windows")) {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } else if (System.getProperty("os.name").contains("Linux")
                    || System.getProperty("os.name").contains("Mac")) {
                new ProcessBuilder("clear").inheritIO().start().waitFor();
            } else {
                System.out.println("Este comando não funciona no seu sistema operacional.");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
	}
}
