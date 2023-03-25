package com.leogereks.cursojava.aula19.labs;

import java.util.Scanner;

public class Ex14 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] vetorA = new int[10];

        for (int i=0; i < vetorA.length; i++) {
            System.out.println("Entre com numeros inteiros para preencher o vetorA: indice "+i);
            vetorA[i] = scan.nextInt();
        }
        double media = 0;
        int impar = 0;
        double soma = 0;
        for (int i=0; i < vetorA.length; i++){
            if (vetorA[i] % 2 != 0){
                soma+=vetorA[i];
                impar++;
                media = soma/impar;
            }
        }
        System.out.println("Media dos numeros impares e: "+media);
    }
}
