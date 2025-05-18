package org.exercicio4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class Alfabetica {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> nomes = new ArrayList<>();

        System.out.println("Digite 3 nomes:");

        for (int i = 0; i < 3; i++) {
            System.out.print("Nome " + (i + 1) + ": ");
            String nome = scanner.nextLine();
            nomes.add(nome);
        }

        //Aproveitei e realizei o exercicio de remover Array duplicados junto com exercicio com nomes em ordem alfabetica

        LinkedHashSet<String> nomesUnicos = new LinkedHashSet<>(nomes);
        ArrayList<String> nomesEmOrdens = new ArrayList<>(nomesUnicos);

        Collections.sort(nomesEmOrdens);

        System.out.println("\nNomes em ordem alfabética:");
        for (String nome : nomesEmOrdens) {
            System.out.println(nome);
        }

        scanner.close();
    }
}
