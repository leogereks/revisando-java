package com.leogereks.cursojava.aula14_15_exercicio;

import java.util.Scanner;

public class Ex14 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Informe numero para saber se é par um impar");
        int numero = scan.nextInt();

        if (numero % 2 == 0){
            System.out.println("par");
        } else {
            System.out.println("impar");
        }
    }
}
