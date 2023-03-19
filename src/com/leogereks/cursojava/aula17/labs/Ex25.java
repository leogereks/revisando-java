package com.leogereks.cursojava.aula17.labs;

import java.util.Scanner;

public class Ex25 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Entre com a quantidade de temperaturas:");
        int qtdTemps = scanner.nextInt();

        double soma = 0;
        double temps;
        double menor = Double.MAX_VALUE;
        double maior = Double.MIN_VALUE;


        for (int i = 1; i <= qtdTemps; i++){
            System.out.println("Informe a temperatura: "+i);
            temps = scanner.nextDouble();


            soma += temps;



            if (temps>maior){
                maior=temps;
            }
            if (temps<menor){
                menor=temps;
            }
        }
        double media = soma/qtdTemps;
        System.out.println("Media "+media);
        System.out.println("Menor "+menor);
        System.out.println("Media "+maior);
    }
}
