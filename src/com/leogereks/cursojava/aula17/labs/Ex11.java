package com.leogereks.cursojava.aula17.labs;

import java.util.Scanner;

public class Ex11 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Entre com primeiro numero:");
        int num1 = scan.nextInt();

        System.out.println("Entre com segundo numero:");
        int num2 = scan.nextInt();

        int soma=0;
        for (int i=num1; i<=num2; i++){
            soma += i;
        }
        System.out.println(soma);
    }
}
