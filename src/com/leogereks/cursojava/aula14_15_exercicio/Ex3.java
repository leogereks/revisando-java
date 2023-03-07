package com.leogereks.cursojava.aula14_15_exercicio;

import java.util.Scanner;

public class Ex3 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Insira F para Feminino ou M para masculino");
        String sexo = scan.next();

        switch (sexo) {
            case "F":
                System.out.println("Sexo feminino");
                break;
            case "M":
                System.out.println("Sexo masculino");
                break;
            default:
                System.out.println("Sexo invalido");
        }
    }
}
