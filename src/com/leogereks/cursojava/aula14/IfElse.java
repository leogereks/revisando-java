package com.leogereks.cursojava.aula14;

import java.util.Scanner;

public class IfElse {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        /*System.out.println("Entre com sua idade");
        int idade = scanner.nextInt();

        if (idade >=18){
            System.out.println("E maior de idade");
        } else {
            System.out.println("Nao é maior de idade");
        }*/

        System.out.println("Informe valor do item:");
        double valor = scanner.nextDouble();

        if (valor <= 10){
            System.out.println("Barato, compre");
        } else if (valor > 10 && valor <15){
            System.out.println("Deveria tentar um desconto");
        } else if (valor >= 15 && valor < 17) {
            System.out.println("Pesquisar mais");
        } else {
            System.out.println("Muito caro, nao comprar");
        }
    }
}
