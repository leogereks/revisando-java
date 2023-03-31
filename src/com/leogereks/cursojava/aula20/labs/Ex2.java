package com.leogereks.cursojava.aula20.labs;

import java.util.Random;

public class Ex2 {

    public static void main(String[] args) {

        int [][] matriz = new int[10][10];

        Random numRandom = new Random();

        for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz[i].length; j++){
                matriz[i][j] = (int)Math.round(Math.random()*100);
                System.out.print(matriz[i][j]+" ");
            }
            System.out.println();
        }

        int maiorL5 = Integer.MIN_VALUE;
        int menorL5 = Integer.MAX_VALUE;
        for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz[i].length; j++){
                if (matriz[5][i] > maiorL5){
                    maiorL5 = matriz[5][i];
                } else if (matriz[5][i] < menorL5) {
                    menorL5 = matriz[5][i];
                }
            }
        }

        int maiorC5 = Integer.MIN_VALUE;
        int menorC5 = Integer.MAX_VALUE;
        for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz[i].length; j++){
                if (matriz[i][7] > maiorC5){
                    maiorC5 = matriz[i][7];
                } else if (matriz[i][7] < menorC5) {
                    menorC5 = matriz[i][7];
                }
            }
        }
        System.out.println("Maior e menor valor da linha 5: "+maiorL5+" e "+menorL5);
        System.out.println("Maior e menor valor da Coluna 7: "+maiorC5+" e "+menorC5);
    }
}
