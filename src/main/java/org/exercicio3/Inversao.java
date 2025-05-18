package org.exercicio3;

import java.util.Scanner;

public class Inversao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();
        int invertido = 0;

        for (; numero != 0; numero /= 10) {
            int digito = numero % 10;
            invertido = invertido * 10 + digito;
        }

        System.out.println("Número invertido: " + invertido);

        scanner.close();
    }
}
