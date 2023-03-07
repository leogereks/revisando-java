package com.leogereks.cursojava.aula13ex;

import java.util.Scanner;

public class Ex8 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Responda qual sua remuneraçao por hora e quantas horas por mes trabalha:");
        double valorHora = scanner.nextDouble();
        double horasMes = scanner.nextDouble();

        double remuneracao = valorHora*horasMes;
        System.out.println("Sua remuneracao mensal é: R$"+remuneracao);

    }
}
