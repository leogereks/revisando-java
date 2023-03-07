package com.leogereks.cursojava.aula13ex;

import java.util.Scanner;

public class Ex6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o raio do circulo que deseja descobrir area:");
        double raio = scanner.nextDouble();

        double area = Math.PI*(Math.pow(raio,2));
        System.out.println(raio+" de raio, gera um circulo com area de "+area);
    }
}
