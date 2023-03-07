package com.leogereks.cursojava.aula14_15_exercicio;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Qual dos numeros e maior?");
        System.out.println("Entre com o numero 1: ");
        double num1 = scan.nextDouble();

        System.out.println("Entre com o numero 2: ");
        double num2 = scan.nextDouble();

        if (num1 > num2) {
            System.out.println("O primeiro numero é maior: "+num1);
        } else {
            System.out.println("O segundo numero é maior: "+num2);
        }
    }
}
