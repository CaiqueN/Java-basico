package org.exercicio6;

public class Funcionario {
    public String nome;
   public double salarioBase;

    public Funcionario(String nome, double salarioBase) {
        this.nome = nome;
        this.salarioBase = salarioBase;
    }

    public void calcularSalario() {
        System.out.println(nome + ": salário base = R$" + salarioBase);

    }

    public static void main(String[] args) {
        Funcionario f1 = new Analista("Caique", 2000);
        Funcionario f2 = new Gerente("Shirley", 2000);

        f1.calcularSalario();
        f2.calcularSalario();
    }
}
