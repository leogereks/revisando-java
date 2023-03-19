package com.leogereks.cursojava.aula17.labs;

import java.util.Scanner;

public class Ex24 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Americanas da Shoppe");
        boolean sair = false;
        String continuarCompra;
        int qtdProdutos;
        double preco = 0;
        double total;
        String output;
        double valorPago,troco;


        do {

            System.out.println("Deseja informar uma nova compra? S/N");
            continuarCompra = scanner.next();

            if (continuarCompra.equalsIgnoreCase("s")){

                output = "Americanas da Shoppe\n";

                System.out.println("Informe qtd de produtos da compra");
                qtdProdutos = scanner.nextInt();

                total=0;
                for (int i = 1; i<=qtdProdutos; i++){
                    System.out.println("Informe os precos do produto "+i);
                    preco = scanner.nextDouble();
                    total+=preco;
                    output += "Produto"+i+" R$ "+preco+"\n";
                }
                output+="Total: R$ "+total;

                System.out.println("Total: R$ "+total);

                System.out.println("Entre com valor pago");
                valorPago = scanner.nextDouble();

                output += "Dinheiro R$ "+valorPago+"\n";

                troco = total-valorPago;

                output += "Troco R$ "+troco+"\n";

                System.out.println(output);
            }else {
                sair=true;
            }

        }while (!sair);

    }
}
