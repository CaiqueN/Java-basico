package org.exercicio2;

import java.util.Scanner;

public class PositivoOuNegativo {
    public static void main(String[] args) {
        Scanner sacnner = new Scanner(System.in);
        int numero = sacnner.nextInt();

        if (numero > 0) {
            System.out.println("O número é positivo.");
        } else if (numero < 0) {
            System.out.println("O numero é negativo");
        } else {
            System.out.println("O numero é zero");

        }

        sacnner.close();
    }
}
