package com.leogereks.cursojava.aula13ex;

import java.util.Scanner;

public class Ex12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe sua altura:");
        double altura = scanner.nextDouble();

        double pesoIdeal = (72.7*altura)-58;

        System.out.println("Seu peso ideal seria: "+pesoIdeal);
    }
}
