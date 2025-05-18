package org.exercicio5;


public class Calculadora {
    public static void main(String[] args) {

        Calculadora calc = new Calculadora();
        System.out.println("Soma " + calc.somar(10, 25));
        System.out.println("Subtrair " + calc.subtrair(25,30));
        System.out.println("Mutiplicar " + calc.multiplicar(10,10));
        System.out.println("Dividir " + calc.dividir(8,3));

    }

    public double somar(double a, double b) {
        return a + b;
    }

    public double subtrair(double a, double b) {
        return a - b;
    }

    public double multiplicar(double a, double b) {
        return a * b;
    }

    public String dividir(double a, double b) {
        if (b == 0) {
            return "Erro: não é possível dividir por zero";
        }
        return String.valueOf(a / b);
    }
}


