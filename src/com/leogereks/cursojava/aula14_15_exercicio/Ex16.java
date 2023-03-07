package com.leogereks.cursojava.aula14_15_exercicio;

import java.util.Scanner;

public class Ex16 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe quantos litros de combustivel foram vendidos");
        double litros = scanner.nextDouble();

        System.out.println("Informe o combustivel vendido (A - alcool G - gasolina)");
        String combustivel = scanner.next();

        double valorGas = 2.5;
        double valorAlc = 1.9;
        double total = 0;
        int desconto = 0;
        double totalDesc = 0;

        if (combustivel.equalsIgnoreCase("a")){
            if (litros <= 20){
                desconto = 3;
            } else{
                desconto = 5;
            }
            total = litros*valorAlc;

        } else if (combustivel.equalsIgnoreCase("g")) {
            if (litros <= 20){
                desconto = 4;
            } else {
                desconto = 6;
            }
            total = litros*valorGas;
        }

        totalDesc = (total/100)*desconto;
        double totalPagar = total - totalDesc;
        System.out.println("Valor desconto: R$"+totalDesc);
        System.out.println("Valor a ser pago: R$"+totalPagar);

    }
}
