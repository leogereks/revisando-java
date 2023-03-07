package com.leogereks.cursojava.aula14_15_exercicio;

import java.util.Scanner;

public class Ex7 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Insira 3 numeros de sua escolha");
        System.out.println("Entre com o numero 1: ");
        double num1 = scan.nextDouble();

        System.out.println("Entre com o numero 2: ");
        double num2 = scan.nextDouble();

        System.out.println("Entre com o numero 3: ");
        double num3 = scan.nextDouble();

        if (num1 > num2 && num1 > num3) {
            System.out.println("O primeiro numero é maior: "+num1);
        } else if (num2 > num1 && num2 > num3){
            System.out.println("O segundo numero é maior: "+num2);
        } else if (num3 > num2 && num3 > num1) {
            System.out.println("O terceiro numero é maior: "+num3);
        }

        if (num1 < num2 && num1 < num3) {
            System.out.println("O primeiro numero é menor: "+num1);
        } else if (num2 < num1 && num2 < num3){
            System.out.println("O segundo numero é menor: "+num2);
        } else if (num3 < num2 && num3 < num1) {
            System.out.println("O terceiro numero é menor: "+num3);
        }
    }
}
