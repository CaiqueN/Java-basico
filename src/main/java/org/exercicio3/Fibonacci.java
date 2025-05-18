package org.exercicio3;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número para a sequência de Fibonacci: ");
        int limite = scanner.nextInt();

        int num = 0;
        int num2 = 1;

        System.out.print("Sequência de Fibonacci até " + limite + ": ");

        System.out.print(num + " " + num2 + " ");

        for (int i = 3; i <= limite; i++) {
            int proximo = num + num2;
            if (proximo > limite) break;
            System.out.print(proximo + " ");
            num = num2;
            num2 = proximo;
        }

        scanner.close();
    }
}
