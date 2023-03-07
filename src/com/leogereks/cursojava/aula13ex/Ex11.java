package com.leogereks.cursojava.aula13ex;

import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe 2 numeros inteiros e 1 numero real:");
        double primeiro = scanner.nextDouble();
        double segundo = scanner.nextDouble();
        double terceiro = scanner.nextDouble();


        double resultadoA = (primeiro * 2)*segundo/2;
        double resultadoB = (primeiro*3)+terceiro;
        double resultadoC = Math.pow(terceiro,3);
        System.out.println("A: "+resultadoA);
        System.out.println("B: "+resultadoB);
        System.out.println("C: "+resultadoC);
    }
}
