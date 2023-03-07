package com.leogereks.cursojava.aula13ex;

import java.util.Scanner;

public class Ex13 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Responda qual sua remuneraçao por hora e quantas horas por mes trabalha:");
        double valorHora = scanner.nextDouble();
        double horasMes = scanner.nextDouble();

        double remuneracaoBruta = valorHora*horasMes;
        System.out.println("Sua remuneracao mensal é: R$"+remuneracaoBruta);

        double inss = (remuneracaoBruta/100)*8;
        double impostoRenda = (remuneracaoBruta/100)*11;
        double sindicato = (remuneracaoBruta/100)*5;
        System.out.println("Vc paga de INSS: R$"+inss);
        System.out.println("Vc paga de imposto de renda: R$"+impostoRenda);
        System.out.println("Vc paga de sindicado: R$"+sindicato);
        double descontosTotal = inss+impostoRenda+sindicato;
        System.out.println("Total descontos: R$"+descontosTotal);

        double remuneracaoLiq = remuneracaoBruta - inss - impostoRenda - sindicato;
        System.out.println("Sua remuneracao contando todos os descontos é: R$"+remuneracaoLiq);

    }
}
