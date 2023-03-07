package com.leogereks.cursojava.aula14_15_exercicio;

import java.util.Scanner;

public class Ex3OutraForma {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Insira F para Feminino ou M para masculino");
        String input = scan.next();

        if (input.equalsIgnoreCase("f")){
            System.out.println("Sexo feminino");
        } else if (input.equalsIgnoreCase("m")) {
            System.out.println("Sexo masculino");
        }else {
            System.out.println("Invalido");
        }

    }
}
