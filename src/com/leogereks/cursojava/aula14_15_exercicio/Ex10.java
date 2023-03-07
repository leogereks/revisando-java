package com.leogereks.cursojava.aula14_15_exercicio;

import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Insira M - matutino V - vespertino e N - noturno");
        String periodo = scan.next();

        switch (periodo) {
            case "m":
            case "M":
                System.out.println("Matutino");
                break;
            case "v":
            case "V":
                System.out.println("Vespertino");
                break;
            case "n":
            case "N":
                System.out.println("Noturno");
                break;
            default:
                System.out.println("Periodo invalido");
        }
    }
}
