package com.leogereks.cursojava.aula17.labs;

import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Entre com primeiro numero:");
        int num1 = scan.nextInt();

        System.out.println("Entre com segundo numero:");
        int num2 = scan.nextInt();

        for (int i=num1; i<=num2; i++){
            System.out.println(i);
        }
    }
}
