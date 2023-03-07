package com.leogereks.cursojava.aula14_15_exercicio;

import java.util.Scanner;

public class Ex15 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe numero 1:");
        double num1 = scanner.nextDouble();

        System.out.println("Informe numero 2:");
        double num2 = scanner.nextDouble();

        System.out.println("Informe qual operacao deseja realizar (+ - / *):");
        String operacao = scanner.next();

        double resultado = 0;
        boolean flag = true;

        switch (operacao){
            case "+":
                resultado = num1+num2;
                break;
            case "-":
                resultado = num1-num2;
                break;
            case "/":
                resultado = num1/num2;
                break;
            case "*":
                resultado = num1*num2;
                break;
            default:
                System.out.println("Valor invalido");
                flag = false;
        }

        if (flag){

            System.out.println("Resultado: "+resultado);

            if (resultado >= 0) {
                System.out.println("Resultado positivo");
            } else {
                System.out.println("Resultado negativo");
            }

            if (resultado % 2 == 0) {
                System.out.println("Resultado par");
            } else {
                System.out.println("Resultado impar");
            }
        }

    }
}
