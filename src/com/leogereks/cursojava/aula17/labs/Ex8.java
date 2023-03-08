package com.leogereks.cursojava.aula17.labs;

import java.util.Scanner;

public class Ex8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num;
        double media;
        int soma=0;
        int maior= Integer.MIN_VALUE;

        for (int i=0; i<5; i++){
            System.out.println("Entre com um numero: ");
            num=scan.nextInt();

            soma += num;

            if (num>maior){
                maior = num;
            }
        }
        media=soma/5;
        System.out.println("O maior numero digitado foi: "+maior);
        System.out.println("A soma dos numeros e: "+soma);
        System.out.println("A media dos numeros e: "+media);
    }
}
