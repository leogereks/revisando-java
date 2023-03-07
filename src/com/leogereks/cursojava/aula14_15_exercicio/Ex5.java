package com.leogereks.cursojava.aula14_15_exercicio;

import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Informe a nota da prova 1:");
        double nota1 = scan.nextDouble();

        System.out.println("Informe a nota da prova 2:");
        double nota2 = scan.nextDouble();

        double media = (nota1+nota2)/2;

        if (media == 10){
            System.out.println("Aprovado com honras! Sua media foi "+media);
        } else if (media >=7) {
            System.out.println("Aprovado! Sua media foi "+media);
        } else if (media <7) {
            System.out.println("Reprovado! Sua media foi "+media);
        }
    }
}
