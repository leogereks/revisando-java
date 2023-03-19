package com.leogereks.cursojava.aula17.labs;

public class Ex23 {
    public static void main(String[] args) {

        System.out.println("Preco do pao: R$0.18");
        System.out.println("Padaria - tabela de precos");

        for (int i = 1; i<=50; i++){
            System.out.println(i+" - R$ "+(0.18*i));
        }
    }
}
