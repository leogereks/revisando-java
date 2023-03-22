package com.leogereks.cursojava.aula19.labs;

import java.util.Scanner;

public class Ex9 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] vetorA = new int[5];

        for (int i=0; i < vetorA.length; i++){
            System.out.println("Entre com os valores do Vetor A, index "+i);
            vetorA[i] = scan.nextInt();
        }

        int qtdPares = 0;
        for (int i=0; i<vetorA.length; i++) {
            if (vetorA[i] % 2 == 0) {
                qtdPares++;
            }
        }
        System.out.print("Vetor A =");
        for (int i=0; i < vetorA.length; i++){
            System.out.print(vetorA[i]+" ");
        }
        System.out.println();
        System.out.println("Quantidade numeros pares: "+qtdPares);
    }
}
