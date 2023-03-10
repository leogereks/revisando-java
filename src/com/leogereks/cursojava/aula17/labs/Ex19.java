package com.leogereks.cursojava.aula17.labs;

import java.util.Scanner;

public class Ex19 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Entre com numero de notas");
        int notas = scan.nextInt();

        int soma=0;
        int media;
        int nota;

        for (int i=0; i<notas; i++){
            System.out.println("Entre com a nota "+(i+1));
            nota = scan.nextInt();
            soma += nota;
        }
        media=soma/notas;
        System.out.println(soma);
        System.out.println(media);
    }
}
