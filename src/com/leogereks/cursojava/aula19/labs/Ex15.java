package com.leogereks.cursojava.aula19.labs;

import java.util.Scanner;

public class Ex15 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] vetorA = new int[10];

        int par = 0;
        int impar = 0;
        for (int i = 0; i < vetorA.length; i++){
            System.out.println("Entre com numero desejado: indice "+i);
            vetorA[i] = scan.nextInt();

            if (vetorA[i] % 2 == 0){
                par++;
            }else {
               impar++;
            }
        }
        impar = vetorA.length - par;
        int porcentagemImpar = (impar*100)/ vetorA.length;
        int porcentagemPar = 100 - porcentagemImpar;

        System.out.println("Qtd numeros impares e: "+impar);
        System.out.println("Qtd numeros impares e: "+par);
        System.out.println("Porcentagem de numeros pares e: "+porcentagemPar+"%");
        System.out.println("Porcentagem de numeros impares e: "+porcentagemImpar+"%");
    }
}
