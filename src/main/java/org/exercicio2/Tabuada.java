package org.exercicio2;

import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um numero para exibir a tabuada");

        int numero = scanner.nextInt();
        System.out.println("Tabuada do " + numero + ":");

        for (int i = 0; i < 10 ; i++) {
            int resultado = numero * i;
            System.out.println("x " + i + " = " + resultado);
            
        }

        scanner.close();
    }
}
