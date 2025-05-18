package org.exercicio5;

public class Main2 {
    public static void main(String[] args) {

        ContaBancaria conta = new ContaBancaria();

        conta.exibirValor();
        conta.depositar(6000);
        conta.sacar(6000);
        conta.sacar(7000);
        conta.exibirValor();
    }
}

class ContaBancaria {
    private double saldo;

    public ContaBancaria() {
        saldo = 6000;
    }

    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Depósito de R$" + valor + " concluído com êxito.");
        } else {
            System.out.println("Valor inválido para depósito.");
        }
    }

    public void sacar(double valor) {
       if (valor <= 0){
           throw new RuntimeException("Valor não esta disponivel para saque");
       } else if (valor > saldo) {
           throw new RuntimeException("Saldo não está disponivel");
       }else {
           saldo -= valor;
           System.out.println("Saque de R$" + valor + "Valor concluido com exito");
       }

    }

    public void exibirValor() {
        System.out.println("Saldo atual: R$" + saldo);
    }
}