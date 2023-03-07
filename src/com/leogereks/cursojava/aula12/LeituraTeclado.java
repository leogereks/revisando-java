package com.leogereks.cursojava.aula12;

import java.util.Scanner;

public class LeituraTeclado {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        /*System.out.println("Digite seu nome completo:");
        String nomeCompleto = scan.nextLine();

        System.out.println("Seu nome é: "+nomeCompleto);

        System.out.println("Digite seu primeiro nome:");
        String primeiroNome = scan.nextLine();
        System.out.println("Seu primeiro nome é: "+primeiroNome);

        System.out.println("Digite sua idade: ");
        int idade = scan.nextInt();
        System.out.println("Sua idade é "+idade);

        System.out.println("Digite sua altura: ");
        double altura = scan.nextDouble();
        System.out.println("Sua altura é "+altura);*/

        System.out.println("Informe seu nome, idade, quantidade de filhos, altura, e se possui pet:");
        String nome = scan.next();
        int idade = scan.nextInt();
        byte qtdFilhos = scan.nextByte();
        float altura = scan.nextFloat();
        boolean pet = scan.nextBoolean();

        System.out.println("Seu nome é: "+nome);
        System.out.println("Sua idade é : "+idade);
        System.out.println("Quantos filhos vc possui? "+qtdFilhos);
        System.out.println("Sua altura é: "+altura);
        System.out.println("Possui pet? "+pet);
    }
}
