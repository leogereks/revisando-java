package com.leogereks.cursojava.aula17.labs;

import java.util.Scanner;

public class Ex17 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Entre com fatorial");
        int fatorial = scan.nextInt();

        double resultadoTemp = fatorial;


        while(fatorial>1){
            resultadoTemp=resultadoTemp*(fatorial-1);
            fatorial--;
            System.out.println(resultadoTemp);
        }

    }
}
