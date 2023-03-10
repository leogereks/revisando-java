package com.leogereks.cursojava.aula17.labs;

import java.util.Scanner;

public class Ex17OutraManeira {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Entre com fatorial");
        int num = scan.nextInt();

        System.out.println(num+"! = ");

        int fatorial = 1;
        for(int i = num; i>0; i--){
            fatorial *= i;
            System.out.println(i);
        }
        System.out.println("Resultado "+fatorial);
    }
}
