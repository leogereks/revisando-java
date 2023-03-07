package com.leogereks.cursojava.aula14_15_exercicio;

import java.util.Scanner;

public class Ex8 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("LISTA DE COMPRAS");
        System.out.println("Item 1: informe nome e valor do produto:");
        String nomeProduto = scan.next();
        double valorProduto = scan.nextDouble();

        System.out.println("Item 2: informe nome e valor do produto:");
        String nomeProduto2 = scan.next();
        double valorProduto2 = scan.nextDouble();

        System.out.println("Item 3: informe nome e valor do produto:");
        String nomeProduto3 = scan.next();
        double valorProduto3 = scan.nextDouble();

        System.out.println("Sua lista:");
        System.out.println("1 "+nomeProduto+" "+valorProduto);
        System.out.println("2 "+nomeProduto2+" "+valorProduto2);
        System.out.println("3 "+nomeProduto3+" "+valorProduto3);

        if (valorProduto < valorProduto2 && valorProduto < valorProduto3) {
            System.out.println("Comprar produto 1: "+valorProduto);
        } else if (valorProduto2 < valorProduto && valorProduto2 < valorProduto3){
            System.out.println("Comprar produto 2: "+valorProduto2);
        } else if (valorProduto3 < valorProduto2 && valorProduto3 < valorProduto) {
            System.out.println("Comprar produto 3: "+valorProduto3);
        }

    }
}
