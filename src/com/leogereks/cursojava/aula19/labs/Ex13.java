package com.leogereks.cursojava.aula19.labs;

import java.util.Scanner;

public class Ex13 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int[] vetorA = new int[10];

        for (int i=0; i< vetorA.length; i++){
            System.out.println("Entre com numeros inteiros para preencher vetor: indice "+i);
            vetorA[i] = scan.nextInt();
        }
        int soma=0;
        for (int i=0; i<vetorA.length; i++){
            if (vetorA[i] % 5 == 0){
                soma+=vetorA[i];
            }
        }
        System.out.print("Soma dos multiplos de 5: "+soma);

    }
}
