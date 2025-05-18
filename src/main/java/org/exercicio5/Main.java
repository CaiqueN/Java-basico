package org.exercicio5;

public class Main {
    public static void main(String[] args) {

        Carro carro = new Carro();
        carro.anoDoModelo = 2025;
        carro.marca = "Honda";
        carro.modelo = "Civic";

        System.out.println("Ano do modelo: " + carro.anoDoModelo);
        System.out.println("Marca: " + carro.marca);
        System.out.println("Modelo: " + carro.modelo);


    }
}
