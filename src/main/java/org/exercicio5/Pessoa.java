package org.exercicio5;

public class Pessoa {

    public String nome = "Sir Cassio";
    int  idade;

    public void verificarIdade(int idade){
        if (idade >= 18) {
            System.out.println("O cidadão " + nome + "é maior de idade pode ir para a prisão");
        }else {
            System.out.println("O cidadão " + nome +"é menor de idade pode ir para o reformatorio ou fazer trabalho voluntario");
        }
    }
}
