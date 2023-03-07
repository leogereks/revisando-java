package com.leogereks.cursojava.aula14_15_exercicio;

import java.util.Scanner;

public class Ex12 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite seu valor/hora:");
        double valorHora = scan.nextDouble();

        System.out.println("Digite suas horas trabalhadas:");
        double horasTrabalhadas = scan.nextDouble();

        double salarioBruto = valorHora*horasTrabalhadas;
        int percentualIr=0;

        if (salarioBruto <= 900){
            percentualIr = 0;
        } else if (salarioBruto > 900 && salarioBruto < 1500) {
            percentualIr = 5;
        }else if (salarioBruto > 1500 && salarioBruto < 2500) {
            percentualIr = 10;
        } else if (salarioBruto > 2500) {
            percentualIr = 20;
        }

        double ir = (salarioBruto/100)*percentualIr;
        double inss = (salarioBruto/100)*10;
        double sindicato = (salarioBruto/100)*3;
        double fgts = (salarioBruto/100)*11;
        double totalDescontos = ir+sindicato+fgts+inss;
        double salarioLiquido = salarioBruto-totalDescontos;

        System.out.println("SALARIO BRUTO: "+salarioBruto);
        System.out.println("IR: "+percentualIr);
        System.out.println("INSS: "+inss);
        System.out.println("SINDICATO: "+sindicato);
        System.out.println("FGTS: "+fgts);
        System.out.println("Total de descontos: "+totalDescontos);
        System.out.println("Salario Liquido: "+salarioLiquido);
    }
    }

