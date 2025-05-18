package org.exercicio5;

public class Livro {

    String livro;
    String autor;
    int anoPublicado;

    public static void main(String[] args) {

        Livro livro = new Livro();

        livro.anoPublicado = 1995;
        livro.livro = "Kakashi Hiden";
        livro.autor = "Masashi Kishimoto";
        livro.exibirInfo();
    }

    public void exibirInfo(){
        System.out.println("Informações do livro:");
        System.out.println("Título: " + livro);
        System.out.println("Autor: " + autor);
        System.out.println("Ano de publicação: " + anoPublicado);
    }
}
