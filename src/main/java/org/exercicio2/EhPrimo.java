package org.exercicio2;

import java.util.Scanner;

public class EhPrimo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();
        boolean ehPrimo = true;

        if (numero <= 1) {
            ehPrimo = false;
        } else {
            for (int i = 2; i < numero; i++) {
                if (numero % i == 0) {
                    ehPrimo = false;
                    break;
                }
            }
        }

        if(ehPrimo){
            System.out.println("É numero primo");
        }else{
            System.out.println("o numero não é primo");
        }

        scanner.close();
    }
}