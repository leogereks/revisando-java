package com.leogereks.cursojava.aula14_15_exercicio;

import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Insira letra para saber se é vogal ou consoante");
        String letra = scan.next();

        if (letra.length()>1){
            System.out.println("Nao é letra valida");
        }else {
            switch (letra) {
                case "a":
                case "e":
                case "i":
                case "o":
                case "u":
                case "A":
                case "E":
                case "I":
                case "O":
                case "U":
                    System.out.println("Vogal");
                    break;
                default:
                    System.out.println("Consoante");
            }
        }
    }
}
