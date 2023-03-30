package com.leogereks.cursojava.aula19.labs;

import java.util.Scanner;

public class Ex16 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int[] vetorA = new int[10];

        double qtdZero = 0;
        double qtdUm = 0;
        for (int i = 0; i < vetorA.length; i++){
            vetorA[i] = (int)Math.round(Math.random()*1);

            if (vetorA[i] == 0){
                qtdZero++;
            }else {
                qtdUm++;
            }
        }

        double porcentagemUm = (qtdUm*100)/ vetorA.length;
        double porcentagemZero = 100 - porcentagemUm;

        System.out.println("Qtd numeros 1 e: "+qtdUm);
        System.out.println("Qtd numeros 0 e: "+qtdZero);
        System.out.println("Porcentagem de numeros 1 e: "+porcentagemUm+"%");
        System.out.println("Porcentagem de numeros 0 e: "+porcentagemZero+"%");
    }
}
