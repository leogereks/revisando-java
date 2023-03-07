package com.leogereks.cursojava.aula13ex;

import java.util.Scanner;

public class Ex2Ex3Ex4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //ex2
        /*System.out.println("Informe um numero de sua escolha:");
        double numero = scan.nextDouble();

        System.out.println("O numero informado foi: "+numero);

        //ex3
        System.out.println("Informe os dois números que deseja somar:");
        double numero1 = scan.nextDouble();
        double numero2 = scan.nextDouble();

        double resultado = numero1+numero2;
        System.out.println("A soma dos numeros informados é: "+resultado);*/

        //ex4
        System.out.println("Calculadora media bimestral:");
        System.out.println("Informe suas 4 notas para calcular sua media:");
        double nota1 = scan.nextDouble();
        double nota2 = scan.nextDouble();
        double nota3 = scan.nextDouble();
        double nota4 = scan.nextDouble();

        double media = (nota1+nota2+nota3+nota4)/4;
        System.out.println("Sua media bimestral e: "+media);
    }
}
