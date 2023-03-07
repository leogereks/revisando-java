package com.leogereks.cursojava.aula13ex;

import java.util.Scanner;

public class Ex7 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe a base ou altura do quadrado:");
        double baseOuAltura = scanner.nextDouble();

        double area = (Math.pow(baseOuAltura,2));
        System.out.println("A area do seu quadrado é "+area);

        double dobroArea = area*2;
        System.out.println("O dobro da area encontrada é: "+dobroArea);
    }
}
