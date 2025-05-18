package org.exercicio6;

public class Gerente extends Funcionario {

    private static final double BONUS = 0.10;

    public Gerente(String nome, double salarioBase) {
        super(nome, salarioBase);
    }

    @Override
    public void calcularSalario() {
        double salarioComBonus = salarioBase * (1 + BONUS);
        System.out.println(nome + " (Gerente) — salário com 10% de bônus: R$" + salarioComBonus);
    }
}
