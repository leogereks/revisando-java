package com.leogereks.cursojava.aula19.labs;

import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int [] vetorA = new int[5];

        for (int i=0; i < vetorA.length; i++){
            System.out.println("Entre com valores do vetor, indice "+i);
           vetorA[i] = scanner.nextInt();
        }

        int soma = 0;
        for (int i =0; i < vetorA.length; i++){
            soma += vetorA[i];
        }

        System.out.print("Vetor A: ");
        for (int i =0; i < vetorA.length; i++){
            System.out.print(vetorA[i]+" ");
        }
        System.out.println();

        System.out.println("Soma: "+soma);
    }
}
