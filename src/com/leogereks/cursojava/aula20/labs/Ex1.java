package com.leogereks.cursojava.aula20.labs;

import java.util.Random;

public class Ex1 {
    public static void main(String[] args) {

        int [][] matriz = new int[4][4];

        Random numRandom = new Random();

        for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz[i].length; j++){
                matriz[i][j] = (int)Math.round(Math.random()*100);
                System.out.print(matriz[i][j]+" ");
            }
            System.out.println();
        }

        int maior = 0;
        int linha = 0;
        int col = 0;
        for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz[i].length; j++){
                if (matriz[i][j] > maior){
                    maior = matriz[i][j];
                    linha = i;
                    col = j;
                }
            }
        }
        System.out.println("Maior valor foi "+maior+" que se encontra na linha "+linha+" coluna "+col);
    }
}
