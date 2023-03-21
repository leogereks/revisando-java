package com.leogereks.cursojava.aula19.labs;

import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int[]vetorA = new int[8];
        double[]vetorB = new double[vetorA.length];

        for (int i=0; i<vetorA.length; i++){

            System.out.println("Informe valor da posicao: "+i);
            vetorA[i] = scan.nextInt();

            vetorB[i] = Math.sqrt(vetorA[i]);
        }
        System.out.print("Vetor A = ");
        for (int i=0; i<vetorA.length; i++){
            System.out.print(vetorA[i]+" ");
        }
        System.out.println();

        System.out.print("Vetor B = ");
        for (int i=0; i<vetorB.length; i++){
            System.out.print(vetorB[i]+" ");
        }
        System.out.println();

    }
}
