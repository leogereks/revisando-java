package com.leogereks.cursojava.aula14_15_exercicio;

import java.util.Scanner;

public class Ex13 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Informe ano:");
        int ano = scan.nextInt();

        if ((ano % 400 == 0) || (ano % 4 == 0 && ano % 100 != 0)) {
            System.out.println("Ano bisexto");
        }else {
            System.out.printf("Ano nao bisexto");
        }
    }
}
