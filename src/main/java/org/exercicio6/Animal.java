package org.exercicio6;

public class Animal {
    public static void main(String[] args) {

        Cachorro cachorro = new Cachorro();
        Gato gato = new Gato();

        gato.emitirSom();
        cachorro.emitirSom();
    }
    public void emitirSom(){
        System.out.println("\nSom do animal");
    }
}
