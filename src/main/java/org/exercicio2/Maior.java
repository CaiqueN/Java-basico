package org.exercicio2;

import java.util.Scanner;

public class Maior {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int numero = scanner.nextInt();

        System.out.print("Digite o segundo número: ");
        int numero_2 = scanner.nextInt();

        System.out.print("Digite o terceiro número: ");
        int numero_3 = scanner.nextInt();

        if (numero >= numero_2 && numero >= numero_3) {
            System.out.println("O maior número é: " + numero);
        } else if (numero_2 >= numero && numero_2 >= numero_3) {
            System.out.println("O maior número é: " + numero_2);
        } else {
            System.out.println("O maior número é: " + numero_3);
        }

        scanner.close();
    }
}