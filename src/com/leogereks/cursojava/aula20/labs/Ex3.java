package com.leogereks.cursojava.aula20.labs;

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] matrizA = new int[3][3];

        for (int i = 0; i < matrizA.length; i++){

            for (int j = 0; j < matrizA[i].length; j++){
                System.out.println("Entre com os valores da matriz - matriz "+i+":");
                matrizA[i][j] = scanner.nextInt();
            }
        }

        int par = 0;
        int impar = 0;
        for (int i = 0; i < matrizA.length; i++){
            for (int j = 0; j < matrizA[i].length; j++){

                if (matrizA[i][j] % 2 == 0){
                    par++;
                }else {
                    impar++;
                }
            }
        }

        for (int i = 0; i < matrizA.length; i++){

            for (int j = 0; j < matrizA[i].length; j++){
                System.out.print(matrizA[i][j]);
            }
            System.out.println();
        }
        System.out.println("Numero elementos par "+par);
        System.out.println("Numero elementos impar "+impar);
    }
}
