package com.api.excecoes;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercicio {
    static Scanner scDouble = new Scanner(System.in);
    static Scanner scInt = new Scanner(System.in);
    

    public static void ex1() {
        double dividendo, divisor, resultado;

        System.out.println("Digite o dividendo: ");
        dividendo = scDouble.nextDouble();
        System.out.println("Digite o divisor: ");
        divisor = scDouble.nextDouble();
        resultado = dividendo / divisor;

        try {
            System.out.println(dividendo + " / " + divisor + " = " + resultado);
        } catch (ArithmeticException e) {
            System.out.println("Erro: Impossível dividir por 0."); //????
        }
    }

    public static void ex2() {
        int input = 0;
        boolean continua = true;

        System.out.print(
            "Escolha uma opção.\n" +
            "1. Opção\n" +
            "2. Outra opção diferente\n" +
            "3. Opção mais diferente ainda\n" +
            "\n" +
            "Opção: "
        );

        while (continua) {
            try {
                input = scInt.nextInt();
                continua = false;
            } catch (InputMismatchException e) {
                System.out.print(
                    "Erro: Este campo apenas aceita números inteiros.\n" +
                    "Opção: "
                );
                scInt.next();
            }
        }

        switch (input) {
            case 1:
                System.out.println("Uau... Opção 1...");
                break;
            case 2:
                System.out.println("Nossa... Opção 2...");
                break;
            case 3:
                System.out.println("Eita... Opção 3...");
                break;
            default:
                System.out.println("Opção inválida.");
                break;
        }
    }

    public static void ex3() {
        String[] nomes = {"Lucas", "Enzo", "Eloisa"};
        int input = 0;
        boolean continua = true;

        System.out.println("Selecione um aluno.");
        for (int i = 0; i < nomes.length; i++) {
            System.out.println(i + 1 + ". " + nomes[i]);
        }
        System.out.print("\nOpção: ");

        while (continua) {
            try {
                input = scInt.nextInt();
                continua = false;
            } catch (InputMismatchException e) {
                System.out.print(
                    "Erro: Este campo apenas aceita números inteiros.\n" +
                    "Opção: "
                );
                scInt.next();
            }
        }

        try {
            System.out.println(nomes[input - 1] + " selecionado(a).");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Erro: Não existe um aluno neste índice.");
        }
    }
}
