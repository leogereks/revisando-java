package com.leogereks.cursojava.aula13ex;

import java.util.Scanner;

public class Ex5 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("**Conversor de centimetros para metros**");
        System.out.println("Informe quantos centimetros deseja converter para metros:");
        double valorCentimetros = scan.nextDouble();

        double conversao = valorCentimetros/100;
        System.out.println(valorCentimetros+" cm para metros corresponde a56,7: "+conversao+" metros");
    }
}
