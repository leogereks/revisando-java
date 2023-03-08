package com.leogereks.cursojava.aula17.labs;

import java.util.Scanner;

public class Ex12 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Informe tabuada do numero que desejar:");
        int tabuada = scan.nextInt();

        System.out.println("Tabuada de "+tabuada+":");

        for (int i =1; i<=10; i++){
            System.out.println(tabuada+" x "+i+" = "+(tabuada*i));
        }

    }
}
