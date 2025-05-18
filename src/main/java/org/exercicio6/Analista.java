package org.exercicio6;

public class Analista extends Funcionario {

    private static final double BONUS = 0.05; // 5%

    public Analista(String nome, double salarioBase) {
        super(nome, salarioBase);
    }

    @Override
    public void calcularSalario() {
        double salarioComBonus = salarioBase * (1 + BONUS);
        System.out.println(nome + " (Analista) — salário com 5% de bônus: R$" + salarioComBonus);
    }
}
