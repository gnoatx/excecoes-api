package com.api.excecoes;

import java.util.Scanner;

public class Exercicio {
    static Scanner scDouble = new Scanner(System.in);
    static Scanner scInt = new Scanner(System.in);
    

    public static void ex1() {
        double dividendo, divisor;

        System.out.println("Digite o dividendo: ");
        dividendo = scDouble.nextDouble();
        System.out.println("Digite o divisor: ");
        divisor = scDouble.nextDouble();

        try {
            System.out.println(dividendo + " / " + divisor + " = " + dividendo / divisor);
        } catch (ArithmeticException e) {
            System.out.println("Erro: Impossível dividir por 0.");
        }
    }

    public static void ex2() {
        int input;

        System.out.print(
            "Escolha uma opção.\n" +
            "1. \n" +
            "2. \n" +
            "3. \n" +
            "\n" +
            "Opção: "
        );
    }
}
