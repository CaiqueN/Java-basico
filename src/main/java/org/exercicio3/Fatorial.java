package org.exercicio3;

import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();

        if (numero < 0) {
            System.out.println("O número deve ser positivo!");
        } else {
            long fatorial = 1;
            if (numero == 0) {
                fatorial = 1;
            } else {
                for (int i = 1; i <= numero; i++) {
                    fatorial *= i;
                }
            }

            System.out.println(numero + "! = " + fatorial);
        }

        scanner.close();
    }
}

