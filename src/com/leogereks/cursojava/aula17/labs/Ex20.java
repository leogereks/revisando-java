package com.leogereks.cursojava.aula17.labs;

import java.util.Scanner;

public class Ex20 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Entre com numero de idades que deseja coletar");
        int idades = scan.nextInt();

        int soma=0;
        int media;
        int idade;

        for (int i=0; i<idades; i++){
            System.out.println("Informe a idade "+(i+1));
            idade=scan.nextInt();
            soma+=idade;
        }
        media=soma/idades;

        if (media > 0 && media < 25){
            System.out.println("Jovens");
        } else if (media > 25 && media < 60) {
            System.out.println("Adultos");
        } else {
            System.out.println("Idosos");
        }
    }
}
