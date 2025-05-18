package org.exercicio6;

public class CartaodeCredito implements Pagamento {

    @Override
    public void realizarPagamento() {
        System.out.println("Pagamento realizado com cartão de crédito.");
    }

    public class Boleto implements Pagamento {
        @Override
        public void realizarPagamento() {
            System.out.println("Pagamento realizado com boleto bancário.");
        }
    }

    public static void main(String[] args) {
        CartaodeCredito cd = new CartaodeCredito();
        cd.realizarPagamento();

        Boleto boleto = cd.new Boleto();
        boleto.realizarPagamento();
    }
}
