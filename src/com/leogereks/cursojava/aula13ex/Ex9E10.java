package com.leogereks.cursojava.aula13ex;

import java.util.Scanner;

public class Ex9E10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Conversor de Farenheit para Celsius");
        System.out.println("Informe quantos graus °F deseja converter:");
        double grausF = scanner.nextDouble();

        double grausC = (5*(grausF-32)/9);
        System.out.println("A temporatura se contra a "+grausC+"°C");

        System.out.println("Conversor de Celsius para Farenheit");
        System.out.println("Informe quantos graus °C deseja converter:");
        double grausCelsius = scanner.nextDouble();

        double grausFarenheit = grausCelsius*1.8+32;
        System.out.println("A temporatura se contra a "+grausFarenheit+"°F");
    }
}
