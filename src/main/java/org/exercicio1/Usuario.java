package org.exercicio1;

import java.util.Scanner;

public class Usuario {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite uma mensagem de boas vindas");

        String mensagem = scanner.next();
        System.out.println("Mensagem registrada com sucesso " + mensagem);
    }
}
