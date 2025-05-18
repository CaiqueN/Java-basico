package org.exercicio4;

import java.util.Scanner;

public class Nota {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 7; i++) {
            System.out.print("Digite a nota do aluno " + (i + 1) + ": ");
            int nota = scanner.nextInt();

            if (nota >= 7) {
                System.out.println("Aluno tirou " + nota + " e passou na prova!");
            } else {
                System.out.println("Aluno tirou " + nota + " e está reprovado.");
            }
        }

        scanner.close();
    }
}
