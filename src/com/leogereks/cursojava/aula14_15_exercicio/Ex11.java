package com.leogereks.cursojava.aula14_15_exercicio;

import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe a sua remuneraçao:");
        double salario = scanner.nextDouble();

        if (salario <= 280){
            double ajusteSalario = ((salario/100)*20)+salario;
            double valorAumento = (salario/100)*20;
            System.out.println("Seu aumento foi de 20%: R$"+valorAumento);
            System.out.println("TOTAL: R$"+ajusteSalario);

        } else if (salario > 280 && salario <= 700) {
            double ajusteSalario = ((salario/100)*15)+salario;
            double valorAumento = (salario/100)*15;
            System.out.println("Seu aumento foi de 15%: R$"+valorAumento);
            System.out.println("TOTAL: R$"+ajusteSalario);

        } else if (salario > 700 && salario <= 1500) {
            double ajusteSalario = ((salario / 100) * 10) + salario;
            double valorAumento = (salario / 100) * 10;
            System.out.println("Seu aumento foi de 10%: R$" + valorAumento);
            System.out.println("TOTAL: R$" + ajusteSalario);

        } else if (salario > 1500) {
            double ajusteSalario = ((salario / 100) * 5) + salario;
            double valorAumento = (salario / 100) * 5;
            System.out.println("Seu aumento foi de 5%: R$" + valorAumento);
            System.out.println("TOTAL: R$" + ajusteSalario);
        }
    }
}
