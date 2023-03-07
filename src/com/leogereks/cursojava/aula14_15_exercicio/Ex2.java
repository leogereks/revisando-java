package com.leogereks.cursojava.aula14_15_exercicio;

import java.util.Scanner;

public class Ex2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Insira um valor numero de sua escolha");
        double numero = scan.nextDouble();

        if (numero>=0){
            System.out.printf("Vc inseriu um numero positivo");
        } else {
            System.out.println("Vc inseriu numero negativo");
        }
    }
}
